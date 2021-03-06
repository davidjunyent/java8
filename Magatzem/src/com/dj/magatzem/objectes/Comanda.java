package com.dj.magatzem.objectes;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dj.magatzem.objectes.utils.Logger;

public class Comanda {
	
	public static final int ESTAT_CREADA=0, ESTAT_PREPARADA=1, ESTAT_ENVIADA=2, ESTAT_ENTREGADA=3;	
	private static final int DIES_ENTREGA_PER_DEFECTE=15;
	private static final DateTimeFormatter DEFAULT_FORMATTER= DateTimeFormatter.
			ofPattern("dd:MM:yy HH:mm");
		
	private static int nextId; 
	private final int id;
	private int estat;
	private List<Item> items;
	private LocalDateTime creada;
	private LocalDateTime preparada;
	private LocalDateTime enviada;
	private LocalDate prevista;
	private LocalDateTime entregada;

	public Comanda(ArrayList<Item> items) {
		estat=ESTAT_CREADA;
		this.items= new ArrayList<Item>(items);
		creada= LocalDateTime.now();
		prevista=creada.plusDays(DIES_ENTREGA_PER_DEFECTE).toLocalDate();
		id=++nextId;
		DecimalFormat df = new DecimalFormat("##0.00");
		StringBuilder result=new StringBuilder();
		double preuTotal=0.0;
		for(Item item:items) {
			double pvp=item.getPrice()-(item.getPrice()*(item.getDiscount()/100));
			preuTotal+=pvp;
			result.append("\n").append(item).append(",").append("PVP amb dte: ").append(df.format(pvp));
			
		}
		
		result.append("\n").append("PVP total: "+df.format(preuTotal));
		Logger.getInstance().debug("Resum comanda: "+result);
	}
	
	public void prepara() {
		estat=ESTAT_PREPARADA;
		preparada=LocalDateTime.now();
		Logger.getInstance().debug("MAIL: La comanda "+id+" ha estat preparada a data "+preparada.format(DEFAULT_FORMATTER)); 

	}
	
	public void envia() {
		estat=ESTAT_ENVIADA;
		enviada=LocalDateTime.now();
		Logger.getInstance().debug("MAIL: La comanda "+id+" ha estat enviada a data "+enviada.format(DEFAULT_FORMATTER)); 

	}
	
	public void entrega() {
		estat=ESTAT_ENTREGADA;
		entregada=LocalDateTime.now();
		if(prevista.compareTo(entregada.toLocalDate())<0) {
			Logger.getInstance().error("La comanda "+id+" s'ha entregat tard.");
		}
		Logger.getInstance().debug("MAIL: La comanda "+id+" ha estat entregada a data "+entregada.format(DEFAULT_FORMATTER));
	}


	public LocalDateTime getCreada() {
		return creada;
	}

	public LocalDateTime getPreparada() {
		return preparada;
	}

	public LocalDateTime getEnviada() {
		return enviada;
	}

	public LocalDate getPrevista() {
		return prevista;
	}

	public LocalDateTime getEntregada() {
		return entregada;
	}

	public int getEstat() {
		return estat;
	}

	public List<Item> getItems() {
		return items;
	}
	
	public List<Item> getOrderedItemsByPrice() {
		
		List<Item> result = new ArrayList<>(getItems());
		Comparator<Item> comparator=new ItemComparatorByPrice();
		
		Collections.sort(result,comparator);
		
		return result;
	}
	public List<Item> getOrderedItemsDefault() {
		List<Item> result = new ArrayList<>(getItems());
		Collections.sort(result);
		return result;
		
	}
	
	public List<Item> getOrderedItemsByQuantity() {
		/*Un altre lamda*/
		List<Item> result = new ArrayList<>(getItems());
		result.sort((o1,o2) -> o1.getQuantity()-o2.getQuantity() );
		return result;
	}
	
	public List<Item> getItemsRelacioants() {
		List<Item> relacionats = new ArrayList<>(items);
		/*
		 * Amb bucle
		for(Item item:items) {
			relacionats.add(item.getItemRelacionat());
		}
		return relacionats;
		*/
		
		/*Amb interficie
		 * *relacionats.replaceAll(new UnaryOperator<Item>() {
			@Override
			public Item apply(Item item) {
				return i.getItemRelacionat();
			}
		});
		*/
		/**
		 * Amb lambda!
		 */
		relacionats.replaceAll(item -> item.getItemRelacionat());
		return relacionats;
	}
	
	public List<Item> getItemsInStock() {		
		List<Item> itemsInStock = new ArrayList<>(items);
		itemsInStock.removeIf(item-> item.getQuantity()>0);
		return itemsInStock;
	}
	
	public int getId() {
		return id;
	}
}
class ItemComparatorByPrice implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		if(o1.getPrice()>o2.getPrice()) return -1;
		if(o1.getPrice()<o2.getPrice()) return 1;
		return 0;
	}
	
}


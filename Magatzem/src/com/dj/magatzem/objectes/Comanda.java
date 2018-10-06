package com.dj.magatzem.objectes;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.dj.magatzem.objectes.utils.Logger;

public class Comanda {
	
	public static final int ESTAT_CREADA=0, ESTAT_PREPARADA=1, ESTAT_ENVIADA=2, ESTAT_ENTREGADA=3;	
	private static final int DIES_ENTREGA_PER_DEFECTE=15;
	private static final DateTimeFormatter DEFAULT_FORMATTER= DateTimeFormatter.
			ofPattern("dd:MM:yy HH:mm");
		
	private static int nextId; 
	private final int id;
	private int estat;
	private ArrayList<Item> items;
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

	public ArrayList<Item> getItems() {
		return items;
	}

	public int getId() {
		return id;
	}

}

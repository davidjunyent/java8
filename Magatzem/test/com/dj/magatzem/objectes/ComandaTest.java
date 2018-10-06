package com.dj.magatzem.objectes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.dj.magatzem.objectes.utils.Logger;

class ComandaTest {

	@Test
	void testComandaEntregada() {
		 Logger.getInstance().debug("testComandaEntregada");
		 
			new Comanda(new ArrayList<>());
			new Comanda(new ArrayList<>());
			new Comanda(new ArrayList<>());
			new Comanda(new ArrayList<>());
			
			
			Comanda comanda=new Comanda(new ArrayList<>());
			
			comanda.prepara();
			comanda.envia();
			comanda.entrega();
			
			assertNotEquals(0, comanda.getId());
	}
	@Test
	void testGetItems() {
		Logger.getInstance().debug("testGetItems");
		ArrayList<Item> items = new ArrayList<>();
		items.add(new Eina("Cargols",2));
		Comanda comanda=new Comanda(items);

		comanda.getItems().add(0,new Eina("Pesols",2));
		assertEquals("Pesols",comanda.getItems().get(0).getName());
	}

	@Test
	void creacioComanda() {
		Logger.getInstance().error("Test creació comanda");

		ArrayList<Item> items = new ArrayList<>();
    	items.add(new Eina("Material Ferro 10",90.75,1,1));
    	items.add(new Eina("Martell",15.35,1,1));
    	items.add(new Eina("Carglos",2.55,10,1));
    	items.add(new Adhesiu("Loctite 2014",6.55,true));
    	items.add(new Adhesiu("Loctite 2018",6.55,false));
    	
    	Comanda comanda=new Comanda(items);
    	assertNotNull(comanda);
    	
		comanda.prepara();
		comanda.envia();
		comanda.entrega();
		
		
    	
	}
}

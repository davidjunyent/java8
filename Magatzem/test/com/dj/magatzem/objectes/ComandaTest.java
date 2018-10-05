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
			
			
			Comanda c=new Comanda(new ArrayList<>());
			
			c.comandaPreparada();
			c.comandaEnviada();
			c.comandaEntregada();
			
			assertNotEquals(0, c.getId());
	}
	@Test
	void testGetItems() {
		Logger.getInstance().debug("testGetItems");
		ArrayList<Item> items = new ArrayList<>();
		items.add(Item.createItem("Cargols",2));
		Comanda c=new Comanda(items);
		//items[0]=Item.createItem("Pesols",2);
		//c.getItems()[0]=Item.createItem("Pesols",2);
		assertEquals("Cargols",c.getItems().get(0).getName());
		
		
		
	}
}

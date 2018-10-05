package com.dj.magatzem.objectes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.dj.magatzem.objectes.utils.Logger;

class ComandaTest {

	@Test
	void testComandaEntregada() {
		 Logger.getInstance().debug("testComandaEntregada");
		 
			new Comanda(new Item[] {});
			new Comanda(new Item[] {});
			new Comanda(new Item[] {});
			new Comanda(new Item[] {});
			
			
			Comanda c=new Comanda(new Item[] {});
			
			c.comandaPreparada();
			c.comandaEnviada();
			c.comandaEntregada();
			
			assertNotEquals(0, c.getId());
	}
	@Test
	void testGetItems() {
		Logger.getInstance().debug("testGetItems");
		Item[] items=new Item[] {  Item.createItem("Cargols",2) };
		Comanda c=new Comanda(items);
		items[0]=Item.createItem("Pesols",2);
		//c.getItems()[0]=Item.createItem("Pesols",2);
		assertEquals("Cargols",c.getItems()[0].getName());
		
		
		
	}
}

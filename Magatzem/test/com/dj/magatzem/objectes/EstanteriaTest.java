/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dj.magatzem.objectes;

import com.dj.magatzem.objectes.utils.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Blau9
 */
public class EstanteriaTest {
    
    public EstanteriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of concerteixCodiAntic method, of class Estanteria.
     */
    @Test
    public void testConcerteixCodiAntic() {
        Logger.getInstance().debug("concerteixCodiAntic");
        String codiAntic = "Sala 5 - Passadis 3";
        Estanteria instance = new Estanteria(codiAntic);
        assertEquals("5-3", instance.toString());
        
    }
/**
     * Test of getNomsItems method, of class Estanteria.
     */
    @Test
    public void testGetNomsItems() {
        Logger.getInstance().debug("getNomsItems");
        Estanteria instance = new Estanteria("1","2");
        
        instance.setItems(new Item[]{
            Item.createItem("A",1),
            Item.createItem("B",1),
            Item.createItem("C",1)});
        
                
        String expResult = "A, B, C";
        String result = instance.getNomsItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        instance.addItems(
            Item.createItem("A",1),
            Item.createItem("B",1),
            Item.createItem("C",1));
        
        instance.addItems(new Item[]{
            Item.createItem("A",1),
            Item.createItem("B",1),
            Item.createItem("C",1)});
        
        Logger.getInstance().debug("Num. Objectes Estanteries: "+Estanteria.NUM_ESTANTERIES);
    }    
    
}

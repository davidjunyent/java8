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
public class ProveidorTest {
    
    public ProveidorTest() {
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
     * Test of demanaItem method, of class Proveidor.
     */
    @Test
    public void testDemanaItem() {
        Logger.getInstance().debug("demanaItem");
        Item item = Item.createItem("Tornillos", 6);
        Proveidor instance = new Proveidor("David Junyent", "d.junyent@gmail.com");
        instance.demanaItem(item);        
        
        
    }

    /**
     * Test of setMail method, of class Proveidor.
     */
    @Test
    public void testSetMail() {
        Logger.getInstance().debug("setMail");
        Proveidor instance = new Proveidor("David Junyent", "d.junyent@gmail.com");
        
        instance.setMail("mailIco@nrrecte");
        
        assertEquals(instance.getMail(), "d.junyent@gmail.com");
        assertEquals(instance.getDomain(), "gmail.com");
    }
    
}

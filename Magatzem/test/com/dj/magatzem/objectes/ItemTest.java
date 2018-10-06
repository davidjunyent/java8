package com.dj.magatzem.objectes;

import com.dj.magatzem.objectes.Item;
import com.dj.magatzem.objectes.utils.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;


public class ItemTest {
    
    public ItemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

  
    /**
     * Test of isOutOfStock method, of class Item.
     */
    @Test
    public void testIsOutOfStock() {
        Logger.getInstance().debug("isOutOfStock");
        Item instance = new Eina("Item 1",1);
        boolean expResult = false;
        boolean result = instance.isOutOfStock();
        assertEquals(expResult, result);
        
        instance.setQuantity(0);
        expResult = true;
        result = instance.isOutOfStock();
        assertEquals(expResult, result);
        
        instance.setQuantity(-1);
        expResult = true;
        result = instance.isOutOfStock();
        assertEquals(expResult, result);
        
    }
    /**
     * Test of getNumberOfManuals method, of class Item.
     */
    @Test
    public void testGetNumberOfManuals() {
        Logger.getInstance().debug("getNumberOfManuals");
        Item instance = new Eina("Item 1",1);
        
        instance.setManuals(new ArrayList<>());
        instance.getManuals().add("M1");
        instance.getManuals().add("M2");
        int expResult = 2;
        int result = instance.getNumberOfManuals();
        assertEquals(expResult, result);
        
        
        instance.addManual("M3");
        expResult = 3;
        result = instance.getNumberOfManuals();
        assertEquals(expResult, result);
        
        instance.setManuals(null);
        expResult = 0;
        result = instance.getNumberOfManuals();
        assertEquals(expResult, result);
        
        instance.setManuals(new ArrayList<>());
        instance.getManuals().add("M1");
        instance.getManuals().add("M2");
        instance.getManuals().add("M3");
        expResult = 3;
        result = instance.getNumberOfManuals();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testAddManual() {
        Logger.getInstance().debug("addManual");
        String manual = "Manual!";
        Item instance = new Eina("Item 1",1);
        
        instance.addManual(manual);
        assertNotNull(instance.getManuals().get(0));
        
        instance.addManual(manual);
        instance.addManual("ManualTestToAdd");
        instance.addManual(manual);
        instance.addManual(manual);
        
        assertNotNull(instance.getManuals().get(0));
        
        instance.addManual(manual);
        
        
        boolean found=false;
        for(String currentManual:instance.getManuals()){
            if(currentManual.equals("ManualTestToAdd")){
                found=true;
                break;
            }
        }
        if(!found){
            fail("ManualTestToAdd not found");
        }
    }
    @Test
    public void testToString() {
    	Logger.getInstance().debug("testToString");
        
    	Object[] items= {new Eina("Cargols",4),new Eina("Martell",1)};
        
        for(Object item:items) {
        	System.out.println(item.toString());
        }
        
        assertEquals(0,0);
    }
    @SuppressWarnings("unused")
	@Test
    public void testItemRelacionat() {
    	Item item1=new Eina("Cargols",4);
    	Item item2=new Eina("Martell",1,2,2);
    	Eina eina=new Eina("Martell 2",1,2,2);
    	
    	Item ref1=item1.getItemRelacionat();
    	Item ref2=item2.getItemRelacionat();
    	Eina ref3=eina.getItemRelacionat();
    	
    	assertEquals(1,1);
    }
    
}

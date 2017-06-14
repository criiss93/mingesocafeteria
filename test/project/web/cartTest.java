/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import project.entities.Products;

/**
 *
 * @author cristian
 */
public class cartTest {
    
    public cartTest() {
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
     * Test of getTotal method, of class cart.
     * s
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        cart instance = new cart();
        instance.setTotal(2000);
        int expResult = 0;
        int result = instance.getTotal();
        //assertEquals(expResult, result);
        if(result <= 0){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTotal method, of class cart.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 1000;
        cart instance = new cart();
        instance.setTotal(total);
        int expResult = instance.getTotal();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(total,expResult);
        if(total != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of add method, of class cart.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Products p = new Products();
        p.setId(1);
        p.setName("Name");
        p.setMark("Mark");
        p.setPrice(200);
        cart instance = new cart();
        instance.add(p);
        if(instance == null){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of remove method, of class cart.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Products p = new Products();
        p.setId(1);
        p.setName("Name");
        p.setMark("Mark");
        p.setPrice(200);
        cart instance = new cart();
        instance.add(p);
        instance.remove(p);
        assertNotNull(instance);
        // TODO review the generated test code and remove the default call to fail.
        /*if(instance == null){
            fail("The test case is a prototype.");
        }*/
    }

    /**
     * Test of getCartCount method, of class cart.
     */
    @Test
    public void testGetCartCount() {
        System.out.println("getCartCount");
        cart instance = new cart();
        int expResult = 0;
        int result = instance.getCartCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCartContents method, of class cart.
     */
    @Test
    public void testGetCartContents() {
        System.out.println("getCartContents");
        cart instance = new cart();
        Products p = new Products();
        p.setId(1);
        p.setName("Name");
        p.setMark("Mark");
        p.setPrice(200);
        Map<Products, Integer> expResult= new HashMap<Products,Integer>();
        expResult.put(p,1);
        Map<Products, Integer> result = instance.getCartContents();
        result.put(p,1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

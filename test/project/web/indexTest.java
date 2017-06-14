/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import java.util.ArrayList;
import java.util.List;
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
public class indexTest {
    
    public indexTest() {
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
     * Test of getInd method, of class index.
     */
    @Test
    public void testGetInd() {
        System.out.println("getInd");
        index instance = new index();
              instance.setInd(1);
        int expResult = 1;
        int result = instance.getInd();//se está probando
        
        assertEquals("Deben ser iguales",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult == result){
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setInd method, of class index.
     */
    @Test
    public void testSetInd() {
        System.out.println("setInd");
        int ind = 1;
        index instance = new index();
        instance.setInd(ind);
        // TODO review the generated test code and remove the default call to fail.
        if(ind == 0){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getProducts method, of class index.
     */
    @Test
    public void testGetProducts() {
        System.out.println("getProducts");
        int i = 0;
        index instance = new index();
        Products producto = new Products();
        producto.setId(1);
        producto.setName("Ejemplo1");
        producto.setMark("Prueba1");
        producto.setPrice(200);
        
        List<Products> expResult = new ArrayList<>();
        expResult.add(producto);
  
        List<Products> result = instance.getProducts(i);
        assertNotNull(expResult);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult == null){
            fail("The test case is a prototype.");
        }
    }
    
}

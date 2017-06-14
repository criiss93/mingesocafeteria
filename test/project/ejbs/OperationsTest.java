/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ejbs;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
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
public class OperationsTest {
    
    public OperationsTest() {
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
     * Test of retrieveProducts method, of class Operations.
     */
    @Test
    public void testRetrieveProducts() throws Exception {
        System.out.println("retrieveProducts");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Operations instance = (Operations)container.getContext().lookup("java:global/classes/Operations");
        List<Products> expResult = null;
        List<Products> result = instance.retrieveProducts();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveProducts2 method, of class Operations.
     */
    @Test
    public void testRetrieveProducts2() throws Exception {
        System.out.println("retrieveProducts2");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Operations instance = (Operations)container.getContext().lookup("java:global/classes/Operations");
        List<Products> expResult = null;
        List<Products> result = instance.retrieveProducts2();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveProducts3 method, of class Operations.
     */
    @Test
    public void testRetrieveProducts3() throws Exception {
        System.out.println("retrieveProducts3");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Operations instance = (Operations)container.getContext().lookup("java:global/classes/Operations");
        List<Products> expResult = null;
        List<Products> result = instance.retrieveProducts3();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIfQueryExists method, of class Operations.
     */
    @Test
    public void testCheckIfQueryExists() throws Exception {
        System.out.println("checkIfQueryExists");
        String query = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Operations instance = (Operations)container.getContext().lookup("java:global/classes/Operations");
        int expResult = 0;
        int result = instance.checkIfQueryExists(query);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnProduct method, of class Operations.
     */
    @Test
    public void testReturnProduct() throws Exception {
        System.out.println("returnProduct");
        String query = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Operations instance = (Operations)container.getContext().lookup("java:global/classes/Operations");
        Products expResult = null;
        Products result = instance.returnProduct(query);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

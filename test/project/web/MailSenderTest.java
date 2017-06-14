/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class MailSenderTest {
    
    public MailSenderTest() {
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
     * Test of sendMail method, of class MailSender.
     */
    @Test
    public void testSendMail() throws Exception {
        System.out.println("sendMail");
        String fromMail = "cafeteria.mingeso@gmail.com";
        String username = "cafeteria.mingeso@gmail.com";
        String password = "cafeteriamingeso";
        String toMail = "cristianlinerosm@gmail.com";
        String subject = "Detalle Orden";
        String message = "Cuerpo del mensaje";
        MailSender instance = new MailSender();
        instance.sendMail(fromMail, username, password, toMail, subject, message);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

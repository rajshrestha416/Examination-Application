/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class LoginFormIT {
    
    public LoginFormIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkStudent method, of class LoginForm.
     * @throws java.lang.Exception
     */
    @Test
    public void testCheckStudent() throws Exception {
        System.out.println("checkStudent");
        LoginForm instance = new LoginForm();
        instance.Username = "rajstha416";
        instance.Password = "neepaal";
        Boolean expResult = true;
        Boolean result = instance.checkStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAdmin method, of class LoginForm.
     */
    @Test
    public void testCheckAdmin() {
        try {
            System.out.println("checkAdmin");
            LoginForm instance = new LoginForm();
            instance.Username = "Admin";
            instance.Password = "Admin123";
            Boolean expResult = true;
            Boolean result = instance.checkAdmin();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginFormIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of main method, of class LoginForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginForm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

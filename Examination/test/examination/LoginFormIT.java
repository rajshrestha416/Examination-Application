/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class LoginFormIT {
    
    public LoginFormIT() {
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
            assertEquals(expResult, expResult);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginFormIT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

}

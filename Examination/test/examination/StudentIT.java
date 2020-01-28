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
public class StudentIT {
    
    public StudentIT() {
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

    @Test
    public void testInsert() {
        try {
            System.out.println("insert");
            Student instance = new Student();
            instance.studentname = "Hari";
            instance.batch = "25";
            instance.username="hari123";
            instance.password = "hari";
            instance.comfirmPassword="hari";
            Boolean expResult = true;
            Boolean result = instance.insert();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of update method, of class Student.
     */
    @Test
    public void testUpdate() {
        try {
            System.out.println("update");
            Student instance = new Student();
            instance.studentname = "Hari";
            instance.batch = "24";
            instance.username="hari123";
            instance.password = "hari";
            instance.comfirmPassword="hari";
            Boolean expResult = true;
            Boolean result = instance.update();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of delete method, of class Student.
     */

   
    
}

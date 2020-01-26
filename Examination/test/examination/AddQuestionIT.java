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
public class AddQuestionIT {
    
    public AddQuestionIT() {
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
     * Test of insertCategory method, of class AddQuestion.
     * @throws java.lang.Exception
     */
    @Test
    public void testInsertCategory() throws Exception {
        System.out.println("insertCategory");
        AddQuestion instance = new AddQuestion();
        instance.insertCategory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AddQuestion.
     */
    @Test
    public void testUpdate() {
        try {
            System.out.println("update");
            AddQuestion instance = new AddQuestion();
            instance.update();
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddQuestionIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of insertSets method, of class AddQuestion.
     * @throws java.lang.Exception
     */
    @Test
    public void testInsertSets() throws Exception {
        System.out.println("insertSets");
        AddQuestion instance = new AddQuestion();
        instance.insertSets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertQuestion method, of class AddQuestion.
     */
    @Test
    public void testInsertQuestion() throws ClassNotFoundException {
        try {
            System.out.println("insertQuestion");
            AddQuestion instance = new AddQuestion();
            instance.insertQuestion();
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (SQLException ex) {
            Logger.getLogger(AddQuestionIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of sameQuestion method, of class AddQuestion.
     */
    @Test
    public void testSameQuestion() {
        try {
            System.out.println("sameQuestion");
            AddQuestion instance = new AddQuestion();
            Boolean expResult = null;
            Boolean result = instance.sameQuestion();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddQuestionIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of checkCategory method, of class AddQuestion.
     * @throws java.lang.Exception
     */
    @Test
    public void testCheckCategory() throws Exception {
        System.out.println("checkCategory");
        AddQuestion instance = new AddQuestion();
        Boolean expResult = null;
        Boolean result = instance.checkCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkSet method, of class AddQuestion.
     * @throws java.lang.Exception
     */
    @Test
    public void testCheckSet() throws Exception {
        System.out.println("checkSet");
        AddQuestion instance = new AddQuestion();
        
        Boolean expResult = null;
        Boolean result = instance.checkSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class AddQuestion.
     */
    @Test
    public void testClear() {
        try {
            System.out.println("clear");
            AddQuestion instance = new AddQuestion();
            instance.clear();
            
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddQuestionIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of main method, of class AddQuestion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AddQuestion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandlogin2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mbali Booi
 */
public class TestLoginTest {
    
    public TestLoginTest() {
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
     * Test of checkTaskDescription method, of class TestLogin.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        TestLogin instance = null;
        boolean expResult = false;
        boolean result = instance.checkTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class TestLogin.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        TestLogin instance = null;
        String expResult = "";
        String result = instance.createTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class TestLogin.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        TestLogin instance = null;
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class TestLogin.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        TestLogin instance = null;
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

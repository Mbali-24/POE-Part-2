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
public class RegistrationAndLogin2Test {
    
    public RegistrationAndLogin2Test() {
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
     * Test of main method, of class RegistrationAndLogin2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RegistrationAndLogin2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class RegistrationAndLogin2.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        RegistrationAndLogin2 instance = new RegistrationAndLogin2();
        instance.register();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class RegistrationAndLogin2.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        RegistrationAndLogin2 instance = new RegistrationAndLogin2();
        boolean expResult = false;
        boolean result = instance.login();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMenu method, of class RegistrationAndLogin2.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        RegistrationAndLogin2 instance = new RegistrationAndLogin2();
        instance.showMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class RegistrationAndLogin2.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        RegistrationAndLogin2 instance = new RegistrationAndLogin2();
        instance.addTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

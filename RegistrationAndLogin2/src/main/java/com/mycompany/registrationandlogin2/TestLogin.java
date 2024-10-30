/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandlogin2;

//Importing a JOptionPane to display messages in a graphical interface.
import javax.swing.*;

/**
 *
 * @author Mbali Booi
 */

//Private Declarations and Attributes.
public class TestLogin {
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private String taskID;
    private String taskStatus;
    private int taskNumber;
    private int taskDuration;
       
    //Creating of Constructors for the Task Class.
    public TestLogin(String taskName, String taskDescription, String developerDetails, int taskNumber, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskID = createTaskID();
        this.taskStatus = taskStatus;
        this.taskNumber = taskNumber;
        this.taskDuration = taskDuration;
    }

    //Method used to validate whether the task description meets the 50 characters length requirement.
    public boolean checkTaskDescription() {
        return this.taskDescription.length() <= 50;
    }

    //Method used to create a task ID that includes initials from the task name, a task number, and initials from developer details.
    public String createTaskID() {
        String taskInitials = taskName.substring(0, 2).toUpperCase();
        String devInitials = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskInitials + ":" + taskNumber + ":" + devInitials;
    }

    //Displaying the results of the system and print the task details.
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Duration: " + taskDuration + " hours";
    }
    
    // Method to return the total hours for a task.
    public int returnTotalHours() {
    // Return the duration of the task
        return this.taskDuration;
    }
}
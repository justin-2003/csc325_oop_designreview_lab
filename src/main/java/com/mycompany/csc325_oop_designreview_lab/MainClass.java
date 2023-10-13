/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {

		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

	 //Created a scanner object to get the input
	 Scanner scnr  = new Scanner(System.in);

	    //Creates a new student object with name James and 12 credits
		Student std1= new Student("James", 20);
		System.out.println("Enter the gpa of " + std1.getName() + ": ");
	    //reads and sets the gpa for the std1
		std1.setGpa(scnr.nextDouble());

                // ToDo 11: Add a toString method for the Senior class

	   //Creates a new student object with name James,age 20 and 12 credits
		Student std2= new Freshman("James", 20, 12); // name, age, credits
	    System.out.println("Enter the gpa of " + std2.getName() + ": ");
		//reads and sets the gpa for the std2
		std2.setGpa(scnr.nextDouble());

        //Creates a new student object with name James,age 30 and 90 credits
		Student std3 = new Senior("John", 30, 90);
		System.out.println("Enter the gpa of " + std3.getName() + ": ");
	    //reads and sets the gpa for the std3
	    std3.setGpa(scnr.nextDouble());


	    // Prints the methods
		System.out.println(std1);
		System.out.println(std2);
	    System.out.println(std3);

		// ToDo 12: Set the gpa of the student using the scanner and user
	 // 		input and then print the output.

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

}


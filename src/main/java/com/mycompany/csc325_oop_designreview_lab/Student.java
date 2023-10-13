/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    private double gpa = 0.0;

    //constructor that takes in the name and age
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }

    // Getters and Setters for gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    // toString methods which prints out the name, age and gpa
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + " , Gpa: " + getGpa();
    }
    // ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}

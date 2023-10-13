package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{
    private int credits;

    //constructor that takes in name,age and credits
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // toString method that prints the toString method from Student and credits
    public String toString(){
        return super.toString() + ", Credits: " + getCredits();
    }


    // getters and setters for credits
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}

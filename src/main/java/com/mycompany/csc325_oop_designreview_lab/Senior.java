package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{

    private int credits;

    //Constructor that will set the credits and checks if the credit is more than 85
    public Senior(String name, int age, int credits) {
        super(name, age);
        if(credits < 85){
            System.out.println("Senior needs to have at least 85 credits!!!");
        }else{
            this.setCredits(credits);
        }
    }

    // toString method that prints the toString method from Student and credits
    public String toString(){
        return super.toString() +  ", Credits: " +  getCredits();
    }

    // Getters and setters for credits
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}

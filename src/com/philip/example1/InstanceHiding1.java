package com.philip.example1;

public class InstanceHiding1 {
    private int a = 50;
    private double b = 60;
    //private int a = 100;

    public void displayData(){
        int a = 10;
        double b = 20;
        //will print the local variables a = 10 and b = 20.0, local variable has
        // priority over instance variable
        System.out.println("Values a = " + a + " b = " + b);

        //will print the instance variables a = 50 and b = 60.0
        System.out.println("Values a = " + this.a + " b = " + this.b);
    }

    public static void main(String[] args) {
        InstanceHiding1 instanceHiding1 = new InstanceHiding1();
        instanceHiding1.displayData();
    }
}

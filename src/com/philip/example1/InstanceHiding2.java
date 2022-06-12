package com.philip.example1;

public class InstanceHiding2 {

    private int a;
    private double b;

    public InstanceHiding2(int a, double b){
        this.a = a;
        this.b = b;
    }

    public void displayData(){
        System.out.println("Values a = " + a + "b = " + b);
    }

    public static void main(String[] args) {
        InstanceHiding2 instanceHiding = new InstanceHiding2(10,20);
        instanceHiding.displayData();
    }
}

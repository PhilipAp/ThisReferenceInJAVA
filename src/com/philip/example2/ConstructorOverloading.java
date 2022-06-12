package com.philip.example2;

public class ConstructorOverloading {

    private int a;
    private double b;

    public ConstructorOverloading(int a, double b){
        this.a = a;
        this.b = b;
    }

    public ConstructorOverloading(int a){
        this(a, 0.0);
    }

    public ConstructorOverloading(){
        this(0);
    }

    public int getA(){
        return a;
    }

    public double getB(){
        return b;
    }
}

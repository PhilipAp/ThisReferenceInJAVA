package com.philip.example3;

public class ThisInMethodCall {

    private void anotherMethod(ThisInMethodCall obj){
        System.out.println("In a anotherMethod");
    }

    public void displayData(){
        anotherMethod(this);
    }

    public static void main(String[] args) {
        ThisInMethodCall thisInMethodCall = new ThisInMethodCall();
        thisInMethodCall.displayData();
    }
}

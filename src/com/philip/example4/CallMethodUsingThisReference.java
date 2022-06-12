package com.philip.example4;

public class CallMethodUsingThisReference {

    private void anotherMethod(){
        System.out.println("In anotherMethod");
    }

    public void displayData(){
        this.anotherMethod();
        String result = this.toString();
        System.out.println(result);
    }

    public static void main(String[] args) {
        CallMethodUsingThisReference reference = new CallMethodUsingThisReference();
        reference.displayData();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteNum = 100;
        short myShortNum = 3000;
        int myIntNum = 10;
        long myLongNum = 5000L + 10L * (myByteNum + myShortNum + myIntNum);
        System.out.println("The Long Value = " + myLongNum);
    }
}

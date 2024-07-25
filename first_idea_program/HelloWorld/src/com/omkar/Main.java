package com.omkar;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a value");
        //Scanner is just a class that allows us to do take input
        //Every class is extend the object class in java
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();
        System.out.println(myString);

    }
}
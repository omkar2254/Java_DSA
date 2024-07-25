package com.omkar;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args){
        System.out.println("Enter a name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("My name is "+name);
    }
}

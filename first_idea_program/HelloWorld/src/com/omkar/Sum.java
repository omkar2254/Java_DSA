package com.omkar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }
}

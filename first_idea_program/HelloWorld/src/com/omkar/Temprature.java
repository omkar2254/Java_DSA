package com.omkar;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter °C temprature: ");
        float temprature = sc.nextFloat();
        float farenhite = ((temprature) * 9/5) + 32;
        System.out.println("Temprature in farenhite: " + farenhite);
    }
}

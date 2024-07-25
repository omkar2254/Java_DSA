package com.omkar;
import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Typecasting done here
//        float num = sc.nextInt();
//        System.out.println(num);
        //This will not allowed
        //int num = sc.nextFloat()

        //Explicitly type casting
        //compressing bigger number into smaller one
        int a = (int)(43.32f); //output: 43
//        System.out.println(a);

        //Automatic type promotion expression
        int x = 257;
        byte b = (byte)(x);
//        System.out.println(b); //256 % 257 = 1

        byte j = 30;
        byte k = 60;
        byte l = 90;
        //You can assign byte values to int but int cannot assign to byte
//        int m = (j * k) / l;
//        System.out.println(m);

        //Java follows unicode principles
//        System.out.println("नमस्कार");

        byte myByte = 48;
        char myChar = 'O';
        short myShort = 1202;
        int myInt = 31;
        float myFloat = 10.00f;
        double myDouble = 0.0001;
//        double myResult = (myFloat * myByte) + (myInt / myChar) - (myDouble * myShort);
        //float + int - double = double
//        System.out.println((myFloat * myByte) + " " + (myInt / myChar) + " " +  (myDouble * myShort));
//        System.out.println(myResult);


    }
}

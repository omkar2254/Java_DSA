package com.omkar;

public class Basics {
    public static void main(String[] args) {
        //Condition and loops
        int a = 10;
        if(a == 10){
            System.out.println("Yes a = 10");
        }

        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }
        System.out.println("Using for loop");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

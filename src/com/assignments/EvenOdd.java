package com.assignments;

import java.util.Scanner;

// Q2: Define a program to find out whether a given number is even or odd.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pleas enter a number: ");
        int n = in.nextInt();
        boolean isEven = evenOdd(n);
        System.out.println("Your number is "+ (isEven? "even": "odd"));
    }

    static boolean evenOdd(int n){
        return n % 2 == 0;
    }
}

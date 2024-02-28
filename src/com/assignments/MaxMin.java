package com.assignments;

import java.util.Scanner;
//Q1: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();
        int maximum = max(a, b, c);
        int minimum = min(a, b, c);
        System.out.println("Maximum number is " + maximum);
        System.out.println("Minimum number is " + minimum);
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}

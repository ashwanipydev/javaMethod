package com.assignments;

import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = in.nextInt();
        if (num < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factorialEx(num));
        }
    }

    static int factorialEx(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

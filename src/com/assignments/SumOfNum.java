package com.assignments;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        sumOfTwoNumber(num1, num2);
    }

    static void sumOfTwoNumber(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}

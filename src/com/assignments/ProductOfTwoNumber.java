package com.assignments;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        productOfTwoNumber(num1,num2);
    }

    private static void productOfTwoNumber(int i, int j) {
        int product = i*j;
        System.out.println("Product of two number is "+product);
    }
}

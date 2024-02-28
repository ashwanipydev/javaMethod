package com.assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int p = in.nextInt();
        System.out.println(p + " " + palindrome(p));
    }

    static String palindrome(int p) {
        if (p < 0) {
            return "Negative numbers are not palindromes.";
        }

        int reversed = 0;
        int original = p;
        int remainder;

        while (p != 0) {
            remainder = p % 10;
            reversed = reversed * 10 + remainder;
            p /= 10;
        }

        if (original == reversed) {
            return "Number is a palindrome";
        } else {
            return "Number is not a palindrome";
        }
    }
}

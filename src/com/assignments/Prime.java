package com.assignments;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = in.nextInt();
        System.out.print("Enter the ending number: ");
        int end = in.nextInt();
        for (int num = start; num <= end; num++) {
            System.out.println("Number " + num + " is " + (isPrime(num) ? "prime." : "not prime."));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

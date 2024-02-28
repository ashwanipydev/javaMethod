package com.javamethod;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pleas enter a number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    // wap method to check number prime or not?
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}

package com.javamethod;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String naam) {
        return "Hello " +  naam;
    }

    static void greeting() {
        System.out.println("Welcome to world of JAVA!!!!");
    }
}

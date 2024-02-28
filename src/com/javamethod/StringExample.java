package com.javamethod;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Name bato");
        String name = in.next();
        String personalised = myGreeting(name);
        System.out.println(personalised);

    }

    static String myGreeting(String naam) {
        return "hello "+ naam;
    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }

}

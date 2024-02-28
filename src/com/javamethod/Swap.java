package com.javamethod;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println("this is in here in main() "+a + " " + b);

        String name = "Ankit";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "java"; // creating a new objects.
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
//        System.out.println("this is in here in method swap() "+a + " " + b);
        // this change will only be valid in this function scope only.
    }
}

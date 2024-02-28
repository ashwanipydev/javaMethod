package com.javamethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Q: Take two number and print them of sum;
//        sum();
//        int x = sum2();
        int x = sum3(12,12);
        System.out.println(x);
//      System.out.println(sum()); //This is not working because the sum method does not return anything. If a method does not return anything, you cannot use it in any predefined method.

    }

    // Pass the value of numbers when you aer calling the method in main();
    static int sum3(int a, int b){
        return a + b;
    }


    // return the value;
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pleas enter a number 1: ");
        int num1 = in.nextInt();
        System.out.print("Pleas enter a number 2: ");
        int num2 = in.nextInt();

        return num1 + num2;
    }



    //this method does not return any thing. so you can not use as expression.e.g: int x = sum() invalid syntax.
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pleas enter a number 1: ");
        int num1 = in.nextInt();
        System.out.print("Pleas enter a number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two number of : "+ sum);
    }
}
package com.javamethod;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       int ans =  sum3(10, 20);
        System.out.println("The sum is : "+ans);
    }
    // arguments and perams
    // pass the value of number when you are calling the method in main()
    static int sum3(int a, int b){
        return a + b;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pleas enter a num1: ");
        int num1 = in.nextInt();
        System.out.print("Pleas enter a num2: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        return sum; //fun end
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pleas enter a num1: ");
        int num1 = in.nextInt();
        System.out.print("Pleas enter a num2: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("The sum is : "+sum);
    }


    /*
    * Syntax of methods
    *
    * return_type name(){
    *   //body
    *   //return statement;
    * }
    * */
}

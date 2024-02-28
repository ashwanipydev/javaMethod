package com.assignments;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = in.nextInt();
        System.out.println("Your grades is : " + gradingSystem(marks));
    }

    static String gradingSystem(int n){
        if (n <= 40){
           return  "Fail";
        } else if (n <= 50) {
            return  "DD";
        } else if (n <= 60) {
            return  "CD";
        }else if (n <= 70) {
            return  "BC";
        }else if (n <= 80) {
            return  "BB";
        }else if (n <= 90) {
            return  "AB";
        }else {
            return  "AA";
        }
    }
}

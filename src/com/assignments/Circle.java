package com.assignments;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        double areaOfCircle = areaOfCircle(radius);
        double circumferenceOfCircle = circumferenceOfCircle(radius);
        System.out.println("Area of the circle: " + areaOfCircle);
        System.out.println("Circumference of the circle: " + circumferenceOfCircle);
    }

    static final double PI = 3.14;

    static double areaOfCircle(double r) {
        return PI * r * r;
    }

    static double circumferenceOfCircle(double r) {
        return 2 * PI * r;
    }
}

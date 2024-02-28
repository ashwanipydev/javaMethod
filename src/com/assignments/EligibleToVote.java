package com.assignments;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        boolean isEligibleToVote = eligibleToVote(age);
        String eligibilityMessage = (isEligibleToVote ? "Congratulations!" : "Sorry!");
        String voteEligibility = (isEligibleToVote ? "eligible" : "not eligible");
        System.out.println(eligibilityMessage + " You are " + voteEligibility + " to vote. Your age is " + age);
    }

    static boolean eligibleToVote(int age) {
        return age >= 18;
    }
}

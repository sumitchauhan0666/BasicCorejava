package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 4 == 0) {
            System.out.println("Given Year is Leap Year" + x);
        } else if (x % 100 == 0) {

            System.out.println("Given Year is  Leap Year" + x);
        } else if (x % 400 == 0) {
            System.out.println("Given Year is  Leap Year" + x);
        } else {
            System.out.println("Given Year is not Leap Year" + x);
        }

    }


}


package com.bridgelabz;

import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int exponent = 30;
        int k=1;
        long result = 1;
        for (int y = 1; y <= exponent; exponent--) {
            result *= n;
            System.out.println("" + n + " to the power " + (k++) + " is " + result);
            }

        }
        //System.out.println("Number of digits: " + count);

    }

package com.bridgelabz;

import java.util.Scanner;

public class quotentremainder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number Dividend :-");
        int y = scanner.nextInt();
        System.out.println("Enter the Number Dividend  :-");
        int x = scanner.nextInt();
        int quotient = y / x;
        int remainder = y % x;
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }


}



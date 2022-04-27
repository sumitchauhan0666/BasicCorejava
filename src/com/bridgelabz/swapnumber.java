package com.bridgelabz;

import java.util.Scanner;

public class swapnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number :-");
        int y = scanner.nextInt();
        System.out.println("Enter the Number Second Nmber  :-");
        int x = scanner.nextInt();
        int k = 0; // swapping number using 3rd variable
        k = y;
        y = x;
        x = k;
        System.out.println(" The First Number is :" + y);
        System.out.println(" The Second Number is :" + x);
    }

}

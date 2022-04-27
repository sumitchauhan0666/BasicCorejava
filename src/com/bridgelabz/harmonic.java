package com.bridgelabz;

import java.util.Scanner;

public class harmonic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (float) 1 / i;
        }
        System.out.println("sum of Nth harmonic is " + sum);
    }
}

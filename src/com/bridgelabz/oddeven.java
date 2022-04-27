package com.bridgelabz;
import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :-");
        int y = scanner.nextInt();

        if(y%2==0) {
            System.out.println("Entered Number is Even");

        }else {
            System.out.println("Entered Number is Odd");
        }
    }
}

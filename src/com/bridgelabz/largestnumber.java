package com.bridgelabz;
import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number First Number :-");
        int x = scanner.nextInt();
        System.out.println("Enter the Number Second Number  :-");
        int y = scanner.nextInt();
        System.out.println("Enter the Number Third NUmber  :-");
        int z = scanner.nextInt();

        if(x > y && x > z){
            System.out.println(" Largest Number is "+x  );
        } else if (y > z) {
            System.out.println(" Largest Number is "+y  );
        } else
        {
            System.out.println(" Largest Number is "+z  );
        }

    }
    }
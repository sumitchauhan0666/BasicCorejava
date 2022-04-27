package com.bridgelabz;
import java.util.Scanner;

public class variableconsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character :-");
        char y = scanner.next().charAt(0);
        switch (y) {
            case 'a':
                System.out.println("Given Alphabet is Vowel");
                break;
            case 'e':
                System.out.println("Given Alphabet is Vowel");
                break;
            case 'i':
                System.out.println("Given Alphabet is Vowel");
                break;
            case 'o':
                System.out.println("Given Alphabet is Vowel");
                break;
            case 'u':
                System.out.println("Given Alphabet is Vowel");
                break;
            default:
                System.out.println(y + " is consonant");
        }
    }

}

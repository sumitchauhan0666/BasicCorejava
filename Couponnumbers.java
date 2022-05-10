package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;

public class Couponnumbers {

        public static void  main(String [] args){

            String chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String randomstring="";
            int length= 6;
            Random random=new Random();

            char [] text=new char[length];
            for(int i=0 ; i< length ; i++){

                text[i] = chars.charAt(random.nextInt(chars.length()));
                 }
            for(int i=0; i< text.length; i++){

                randomstring += text[i];
            }
               System.out.println("Coupon Code: "+randomstring);

        }
}

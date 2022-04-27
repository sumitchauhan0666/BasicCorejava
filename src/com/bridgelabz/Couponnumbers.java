package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;

public class Couponnumbers {

    function generateRandom(int min = 0, int max = 100) {

        // find diff
       int difference = max - min;

        // generate random number
        int rand = Math.floor(generateRandom(0 ,100));

        // multiply with difference
        rand = Math.floor( rand * difference);

        // add with min value
        rand = rand + min;

        return rand;


        public static void  main(String [] args){



    }
}

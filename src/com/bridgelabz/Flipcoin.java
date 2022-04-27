package com.bridgelabz;

import java.util.Random;

public class Flipcoin {
    public static void main(String [] args){
        Random random=new Random();
        double x= random.nextDouble(0,1);
        if(x<0.5)
        {
         System.out.println("The Percentage of Tails is "+x*100);
        }else {
            System.out.println("The Percentage of  Head is "+x*100);
        }
        System.out.println("The Number generate is "+x);

    }
}

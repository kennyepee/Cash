package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] coins = {1,5,10,25};

    int count = 0;
    float amount;
        do {
            System.out.print("Change owed?: ");
             amount = sc.nextFloat();
        }while(amount<= 0.00);

        int cents = Math.round(amount * 100);

        while (cents >= 25)
        { count++;
            cents -= 25;
        }
        while (cents >= 10)
        { count++;
            cents -= 10;
        }
        while (cents >= 5)
        { count++;
            cents -= 5;
        }
        while (cents >= 1)
        { count++;
            cents -= 1;
        }


        for (int i =coins.length - 1; i>=0; i++){
        if (cents<=0)break;
        if (coins[i]<=cents){
            count += cents/coins[i];
            cents = cents % coins[i];
        }
    }
        System.out.println(count);
    }
}
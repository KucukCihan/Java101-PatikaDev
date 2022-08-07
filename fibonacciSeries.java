package Giris;

import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {

        /* Fibonacci = 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 .... , (n-2) , (n-1) , n
        n = (n-1) + (n-2)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci serisi yazdırıcıya hoşgeldiniz!");

        System.out.print("Kaç adım yazdırmak istiyorsunuz: "); // get step input
        int step = input.nextInt();

        int minus2Step = 0, minus1Step = 1, currStep;

        for (int i = 1; i <= step; i++)
        {
            if (i == 1){
                System.out.print(minus2Step + " ");
            } else if (i == 2) {
                System.out.print(minus1Step + " ");
            } else {
                currStep = (minus2Step + minus1Step);
                System.out.print(currStep + " ");
                minus2Step = minus1Step;
                minus1Step = currStep;
            }
        }

    }
}


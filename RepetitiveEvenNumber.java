package Giris;

import java.util.Arrays;

public class RepetitiveEvenNumber {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 6, 7, 8, 4, 3, 2, 5, 9, 2, 4, 6, 8, 5, 1};
        int[] repetitive = new int[arr.length];   // declare array called repetitive same length of arr

        int index = 0;

        for (int i = 0; i < arr.length; i++) {      // navigate through arr with i index
           for (int j = 0; j < arr.length; j++) {   // navigate through arr with j index
               if ( (arr[i] == arr[j]) && (i == j) ) {

                   if (arr[i] % 2 != 0) {    // if value is not even continue
                       continue;
                   }

                   int counter = 0;                 // count how many times repetitive[] contains arr[i]
                   for (int search : repetitive) {
                       if (arr[i] == search) {
                           counter++;
                       }
                   }

                   if (counter < 1) {               // if repetitive[] not contains arr[i] yet
                       repetitive[index] = arr[i];    // add arr[i] to repetitive[]
                       index++;
                   }
               }
           }
        }

        int[] result = Arrays.copyOf(repetitive, index);
        System.out.println(Arrays.toString(result));

    }
}

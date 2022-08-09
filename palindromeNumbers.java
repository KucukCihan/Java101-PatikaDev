import java.util.Scanner;
public class palindromeNumbers {

     /* 1- create copy of number called temp

        while there is a digit in temp:
            2- get last digit of temp
            3- add digit to number called reverseNumber
            4- multiply reverseNumber by 10
            5- divide temp by 10

        if reverseNumber == number  : return true
        else : return false                         */

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, digit;
        while (temp != 0) {
            digit = temp % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            temp /= 10;
        }
        System.out.println("Sayınızın tersi: " + reverseNumber);
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrom Sayı sorgulayıcıya hoşgeldiniz!");

        System.out.print("Sorgulamak istediğiniz sayı: ");
        int n = input.nextInt();
        System.out.println(isPalindrom(n)?
                (n + " Bir Palindrom Sayıdır!") : (n + " palindrom sayı değildir."));
    }
}
package Giris;

import java.util.Scanner;
public class commonDivisor_commonMultiple {
    public static void main(String[] args) {

        // gcd(ebob) = greatest common divisor and lcm(ekok) = least common multiple
        // lcm = ((num1 * num2) / gcd)

        Scanner input = new Scanner(System.in);
        int num1, num2, n = 1, gcd = 1, lcm;
        System.out.println("EBOB-EKOK hesaplayıcıya hoşgeldiniz!");
        System.out.print("Birinci sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        num2 = input.nextInt();

        while ((n <= num1) && (n <= num2))      // do until n is bigger than either num1 or num2
        {
            if ((num1 % n == 0) && (num2 % n == 0)) {
                gcd = n;
            }
            n++;
        }
        lcm = ((num1 * num2) / gcd);
        System.out.println("EBOB(" + num1 + ", " + num2 + ") = " + gcd);
        System.out.println("EKOK(" + num1 + ", " + num2 + ") = " + lcm);
    }
}

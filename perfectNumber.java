import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        /* Perfect Number: A positive integer that is equal to the sum of its proper divisors.
         The smallest perfect number is 6, which is the sum of 1, 2, and 3.
         Other perfect numbers are 28, 496, and 8,128. */
        /* Mükemmel Sayı: Pozitif bölenlerinin toplamı kendisinin 2 katına eşit olan pozitif sayılardır.
          En küçük mükemmel sayı olan 6 sayısı: 1, 2, 3 ve 6 bu sayının bölenleridir ve tüm bu bölenlerin toplamı,
         yani 1+2+3+6, sayının iki katı olan 12’ye eşittir.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("*Mükemmel Sayı* sorgulayıcıya hoşgeldiniz!");

        int num, sumDivisorsNum;

        do {               // do till user finds the perfect number
            System.out.print("Sorgulamak istediğiniz sayı: ");
            num = input.nextInt();            // get guess input for perfect number
            sumDivisorsNum = 0;

            for (int i = 1; i <= num; i++) {  // sum all divisors of number
                if (num % i == 0) {
                    sumDivisorsNum += i;
                }
            }
            if (sumDivisorsNum == (2 * num)) {
                System.out.println("\n" + num + " Mükemmel bir sayıdır.");
            } else {
                System.out.println(num + " Mükemmel sayı değildir!");
            }

        } while (sumDivisorsNum != (2 * num));
        
    }
}

import java.util.Scanner;
public class recursivePrimeNumber {
    static int is_Prime(int n, int i) {
        if (n/2 >= i) {
            if (n % i != 0) {
                return is_Prime(n, ++i);
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Asal sayı sorgulayıcıya hoşgeldiniz");

        System.out.print("Sayı girin: ");
        int number = sc.nextInt();

        if (number >= 2) {
            String message = (is_Prime(number, 2) == 1) ? " Asaldır!" : " asal değildir.";
            System.out.println(number + message);
        } else if (number == 1 || number == 0) {
            System.out.println(number + " asal değildir.");
        } else {
            System.out.println("Lütfen doğal sayı girin.");
        }

    }
}


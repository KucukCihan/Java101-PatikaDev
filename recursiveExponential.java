import java.util.Scanner;
public class recursiveExponential {
    static double exponential(int base, int power) {
        if (power == 0 ) {
            return 1;
        } else {
            if (power > 0) { // positive powers
                return base * exponential(base, --power);
            } else {         // negative powers
                return (1.0 / base) * exponential(base, ++power);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Üslü Sayı hesaplayıcıya hoşgeldiniz!\nKapatmak için Tabanı '@' giriniz.");

        do {
            System.out.print("Tabanı giriniz: ");
            String str = sc.next();    // if user decides to stop the loop types '@'

            if (str.equals("@")) {
                System.out.println("\nSistem kapatıldı!"); break;
            }
            int a = Integer.parseInt(str);
            System.out.print("Üssü giriniz: ");
            int b = sc.nextInt();
            System.out.println("Sonuç = " + exponential(a, b));
        } while (true);

    }
}

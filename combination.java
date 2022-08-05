import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        int n, r, nfac = 1, rfac = 1; // default values are 1 for factorials
        System.out.println("Kombinasyon hesaplayan programa hoşgeldiniz!");
        Scanner input = new Scanner(System.in);

             // ask for combination inputs
        System.out.print("Kombinasyonunu almak istediğiniz değer: ");
        n = input.nextInt();
        System.out.print(n + "'sayısının kaçlı kombinasyonu alınsın: ");
        r = input.nextInt();

        if ((n >= 0) && (r >=0))  // if inputs are natural do the following
        {
            System.out.print(n + "'sayısının " + r + "'ile kombinasyonu = ");
            while (r >= 1)        // *simple formula for combination
            {
                nfac *= n;
                rfac *= r;
                --n;
                --r;
            }
            int combination = (nfac / rfac);  // *
            System.out.println(combination);

            System.out.println("Kombinasyon alma işlemi tamamlandı!");
        }
        else                  // if inputs are not natural
        {
            System.out.println("Lütfen negatif sayı girmeyiniz.");
        }

    }
}

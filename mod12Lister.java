import java.util.Scanner;
public class mod12Lister {
    public static void main(String[] args) {
        int limit, sum = 0, quantity = 0, mean; // none of the outcomes are decimal

        System.out.println("12'ye bölünen sayıları hesaplayan programa hoşgeldiniz!");
        Scanner input = new Scanner(System.in);

        System.out.print("Hangi sayıya kadar gidilsin: "); // ask for peak point
        limit = input.nextInt();

        for (int i=0; i<=limit; i++)   // from 0 to peak point search every number 1by1
        {
            if ((i % 3 != 0) || (i % 4 != 0))
            {
                continue;              // if mod12 !=0 search another number
            }
            sum += i;                  // if mod12 == 0 do the following
            quantity++;
            System.out.println(quantity + ". sayı: " + i);
        }
        mean = sum / quantity;          // calculate mean and print
        System.out.println("Toplamları: " + sum + "\nOrtalamaları: " + mean);
    }
}
import java.util.Scanner;
public class sumMultiplesOf4 {
    public static void main(String[] args) {
        int number;
        double sum = 0, quantity = 0, mean = 0;
        boolean isEven = true;                   // use this to start the loop on 'even number' cases
        StringBuilder list4 = new StringBuilder();
        Scanner input = new Scanner(System.in);

        while (isEven)
        {
            System.out.print("Sayı girin: ");   // get number input
            number = input.nextInt();
            if (number % 2 != 0)          // if number is odd
            {
                isEven = false;           // stop the loop
            }
            else if (number % 4 == 0)     // if number is divisible by 4 do the following
            {
                list4.append(number).append(" ");
                quantity++;
                sum += number;
                mean = (sum / quantity);
            }
        }  // print final status
        System.out.println("4'e tam bölünenler: " + list4);
        System.out.println("4'e tam bölünen sayıların adeti: " + quantity);
        System.out.println("4'e tam bölünen sayıların toplamı: " + sum);
        System.out.println("4'e tam bölünen sayıların ortalaması: " + mean);
    }
}

import java.util.Scanner;
public class minMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen sayıların en büyüğünü ve en küçüğünü" +
                "\nhesaplayan programa hoşgeldiniz!\n");
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int quantity = input.nextInt();       // get input for quantity of numbers to compare

        double min = 0, max = 0;              // declare min and max as 0
        for (int i = 1; i <= quantity; i++)   // from 1 to quantity do the following
        {
            System.out.print(i + ". sayıyı giriniz: ");
            double num = input.nextDouble();

            if (i == 1) {                     // if current number is the first;
                max = num; min = num;         // its maximum and minimum

            } else if (num > max) {           // if current number is bigger than max
                max = num;                    // its maximum
            } else if (num < min) {           // if current number is less than min
                min = num;                    // its minimum
            }
        }
        System.out.println("En küçük = " + min);  // print min value
        System.out.println("En büyük = " + max);  // print max value
    }
}

import java.util.Scanner;
public class harmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double harmonic, harmonicSum = 0;
        String s = "";

        System.out.print("Harmonik serisini yazdırmak istediğiniz sayıyı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++)
        {
            harmonic = (1.0 / i);
            s += harmonic + " ";
            harmonicSum += harmonic;
        }
        System.out.println("Harmonik serinin adımları: " + s);
        System.out.println("Harmonik adımların toplamı = " + harmonicSum);




    }
}

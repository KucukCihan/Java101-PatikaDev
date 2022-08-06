import java.util.Scanner;
public class harmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double harmonic, harmonicSum = 0;
        String s = "";

        System.out.print("Harmonik serisini yazdırmak istediğiniz sayıyı giriniz: ");
        number = input.nextInt();             // get number for peak point

        for (int i = 1; i <= number; i++)
        {
            harmonic = (1.0 / i);             // this is how harmonic series goes (1 + 1/2 + 1/3 .... 1/n)
            s += harmonic + " ";
            harmonicSum += harmonic;
        }
        System.out.println("Harmonik serinin adımları: " + s);
        System.out.println("Harmonik adımların toplamı = " + harmonicSum);
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class HarmonicMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verilen tek boyutlu dizinin harmonik ortalamasını " +
                "hesaplayan programa hoşgeldiniz");

        System.out.print("Dizi kaç elemanlı olsun : "); // get length input for array
        int n = sc.nextInt();

        double[] arr = new double[n];                   // define arr
        double[] harmonicArr = new double[n];           // define harmonic array of arr

        for (int i = 0; i < n; i++) {                   // fill arr with inputs
            System.out.print("Dizinin " + i + ". elemanı : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {                   // fill harmonicArr with harmonic elements of arr
            harmonicArr[i] = 1 / arr[i];
        }

        double sumHarmonic = 0;

        for (double i : harmonicArr) {                          // sum harmonicArr elements
            sumHarmonic += i;
        }

        double meanHarmonic = (n / sumHarmonic);  // calculate sum of the harmonicArr elements' mean

        System.out.println("Dizi : " + Arrays.toString(arr));   // print arr
        System.out.println("Dizinin harmonik seri dizisi : " + Arrays.toString(harmonicArr));  // print harmonicArr
        System.out.println("Harmonik ortalama = " + meanHarmonic);  // print mean of harmonicArr
    }
}

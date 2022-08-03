package Giriş;
import java.util.Scanner;
public class KitleIndexi {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        double height, weight, massIndex;

        System.out.print("Boy uzunluğunu girin(m): ");
        height = myInput.nextDouble();

        System.out.print("Kilo değeri girin(kg): ");
        weight = myInput.nextDouble();

        massIndex = (weight/(height * height));
        System.out.println("Vücut kitle indeksi: "+massIndex);
    }
}

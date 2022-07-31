package Giriş;
import java.util.Scanner;
public class DaireDilimAlanı {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);  // Scanner class identify
        double r, 𝛼, 𝜋; // define radius-centerAngle-piValue
        𝜋 = 3.14;

        System.out.print("Daire diliminin yarıçapı: "); // get radius
        r = myInput.nextDouble();

        System.out.print("Merkez açı ölçüsü: ");  // get centerAngle
        𝛼 = myInput.nextDouble();

        double alan;
        alan = (((𝜋 * r * r) * 𝛼) / 360);
        System.out.println("Daire diliminin alanı: "+alan);
    }
}

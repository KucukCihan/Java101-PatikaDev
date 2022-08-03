import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        double a, b, c;       // lengths of triangle

        Scanner myInput = new Scanner(System.in); // Scanner class identify

        System.out.print("Üçgenin 1. kenar uzunluğu: ");
        a = myInput.nextDouble();

        System.out.print("Üçgenin 2. kenar uzunluğu: ");
        b = myInput.nextDouble();

        System.out.print("Üçgenin 3. kenar uzunluğu: ");
        c = myInput.nextDouble();

        double u, alan;               // mathematical formula to calculate triangle area
        u = ((a + b + c) / 2);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: "+alan);
    }
}

package Giriş;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in); // Scanner class identify
        int acilisUcreti, minimumTutar;
        acilisUcreti = 10;
        minimumTutar = 20;
        double kmUcreti = 2.20;

        System.out.print("Gidilen Mesafe(km): "); // get distance value
        double mesafe = myInput.nextDouble();

        double hesap, sonTutar;  // deciding if charge is lower than min price
        hesap = acilisUcreti + (mesafe * kmUcreti);
        sonTutar = (hesap < minimumTutar)? minimumTutar:hesap;

        System.out.println("Tutar: ₺"+sonTutar);
    }
}

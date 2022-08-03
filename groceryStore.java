package Giriş;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        double pear, apple, tomatoes, banana, eggplant;
        pear = 2.14;
        apple = 3.67;
        tomatoes = 1.11;
        banana = 0.95;
        eggplant = 5.00;

        double amountP, amountA, amountT, amountB, amountE;
        System.out.print("Kaç kg 'armut' aldınız: ");
        amountP = myInput.nextDouble();
        System.out.print("Kaç kg 'elma' aldınız: ");
        amountA = myInput.nextDouble();
        System.out.print("Kaç kg 'domates' aldınız: ");
        amountT = myInput.nextDouble();
        System.out.print("Kaç kg 'muz' aldınız: ");
        amountB = myInput.nextDouble();
        System.out.print("Kaç kg 'patlıcan' aldınız: ");
        amountE = myInput.nextDouble();

        double priceP = (pear * amountP);
        double priceA = (apple * amountA);
        double priceT = (tomatoes * amountT);
        double priceB = (banana * amountB);
        double priceE = (eggplant * amountE);

        double totalPrice;
        totalPrice = (priceP + priceA + priceT + priceB + priceE);
        System.out.print("Toplam tutar: ₺"+totalPrice);
    }
}

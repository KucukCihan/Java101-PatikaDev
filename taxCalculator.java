import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        double sonFiyat, kdvKatsayisi, kdvTutari, baslangicFiyat, kdvYuzdesi; // double for exact values

        Scanner myInput = new Scanner(System.in);             // Scanner class identify

        System.out.print("Başlangıç fiyatını girin: ");
        baslangicFiyat = myInput.nextDouble();              // get price input

        kdvKatsayisi = (baslangicFiyat < 1000)? 0.18:0.08; // decide kdv coefficient according to price

        kdvYuzdesi = (kdvKatsayisi * 100);                // calculate kdv percentage
        kdvTutari = (kdvKatsayisi * baslangicFiyat);     // calculate kdv price
        sonFiyat = (kdvTutari + baslangicFiyat);        // calculate total price

        System.out.println("₺"+baslangicFiyat+" için KDV tutarı: ₺"+kdvTutari+"(%"+kdvYuzdesi+")");
        System.out.println("KDV dahil son fiyat: ₺"+sonFiyat);
    }
}

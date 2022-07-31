import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double toplam, ortalama; // double for precision
        String sonuc;

        Scanner myInput = new Scanner(System.in); // Scanner class identify

        System.out.print("Matematik notu: "); // Get input values
        matematik = myInput.nextInt();

        System.out.print("Fizik notu: ");
        fizik = myInput.nextInt();

        System.out.print("Kimya notu: ");
        kimya = myInput.nextInt();

        System.out.print("Türkçe notu: ");
        turkce = myInput.nextInt();

        System.out.print("Tarih notu: ");
        tarih = myInput.nextInt();

        System.out.print("Müzik notu: ");
        muzik = myInput.nextInt();

        toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        ortalama = (toplam / 6);
        sonuc = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        // decide whether a or b happens according to condition

        System.out.println("Ortalama:" + ortalama + " " + sonuc);
    }
}
import java.util.Scanner;
public class notOrtalamaIF {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music, totalLessons , invalidLessons ;
        totalLessons = 5;    // assign total lessons to calculate mean
        invalidLessons = 0; // at first all of the lessons valid for sum and mean
        double sum, mean;  // double for precision
        String sonuc;

        Scanner myInput = new Scanner(System.in);
        System.out.println("Notlar sadece 0-100 arasında girilirse ortalamaya katılır!");

        System.out.print("Matematik notu: ");   // ask for grade input
        math = myInput.nextInt();
        if ((math > 100) || (math < 0)) {       // if grade isnt in valid interval
            math = 0;                           // set grade to zero
            invalidLessons++;                   // increase invalid lessons by 1
        }

        System.out.print("Fizik notu: ");
        physics = myInput.nextInt();
        if ((physics > 100) || (physics < 0)) {
            physics = 0;
            invalidLessons++;
        }

        System.out.print("Türkçe notu: ");
        turkish = myInput.nextInt();
        if ((turkish > 100) || (turkish < 0)) {
            turkish = 0;
            invalidLessons++;
        }

        System.out.print("Kimya notu: ");
        chemistry = myInput.nextInt();
        if ((chemistry > 100) || (chemistry < 0)) {
            chemistry = 0;
            invalidLessons++;
        }

        System.out.print("Müzik notu: ");
        music = myInput.nextInt();
        if ((music > 100) || (music < 0)) {
            music = 0;
            invalidLessons++;
        }

        sum = (math + physics + turkish + chemistry + music); // calculate sum & mean
        mean = (sum / (totalLessons - invalidLessons));  // use only valid lessons for mean

        sonuc = (mean >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        // decide whether a or b case happens according to condition

        System.out.println("Ortalama: " + mean + "\t" + sonuc);
        System.out.print("Ortalama '" + (totalLessons - invalidLessons));
        System.out.println("' ders üzerinden hesaplanmıştır.");
    }
}

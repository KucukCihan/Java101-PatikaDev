import java.util.Scanner;
public class havaSicakligi {
    public static void main(String[] args) {
        double temperature;    // double for convenient input
        Scanner myInput = new Scanner(System.in);

        System.out.print("Aktivite tavsiyesi istediğiniz sıcaklığı giriniz.\n(°C): ");
        temperature = myInput.nextDouble();    // ask for temperature input

        if (temperature > 25) {    // decide activity according to temp. input
            System.out.println("Yüzmeye ne dersiniz!");
        } else if (temperature < 5) {
            System.out.println("Haydi Uludağ'a çıkıp kayak yapalım!");
        } else {
            if (temperature > 15) {
                System.out.println("Orman havasında piknik iyi gider");
            } else {
                System.out.println("Vizyona güzel filmler gelmiş olmalı, haydi biletini al!");
            }
        }
    }
}

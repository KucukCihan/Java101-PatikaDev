import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        int year, mod4, mod100, mod400;  // define variables

        System.out.println("Artık yıl hesaplayan programa hoşgeldiniz!");
        Scanner myInput = new Scanner(System.in);

        System.out.print("Hesaplamak istediğiniz yılı giriniz: ");
        year = myInput.nextInt();
        mod4 = (year % 4);     // year mod 4 = ?
        mod100 = (year % 100); // year mod 100 = ?
        mod400 = (year % 400); // year mod 400 = ?

        if (year < 0)
        {
            System.out.println("Yıl değeri negatif olamaz!");
        }
        else
        {
            // (mod4!=0) OR (mod100==0 and mod400!=0) its not leap year

            if ((mod4 != 0) || ((mod100 == 0) && (mod400 != 0)))
            {
                System.out.println(year + " artık yıl değildir!");
            }
            else  // all the rest possibilities are leap year
            {
                System.out.println(year + " bir artık yıldır!");
            }
        }
    }
}

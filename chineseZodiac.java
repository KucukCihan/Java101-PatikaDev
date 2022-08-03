import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        int year, modValue;

        System.out.println("Çin zodyağı burç yorumcusuna hoşgeldiniz!");

        Scanner myInput = new Scanner(System.in);    // get birth year input
        System.out.print("Doğum yılınızı giriniz: ");
        year = myInput.nextInt();
        modValue = (year % 12);

        if (year < 0)      // invalid year value
        {
            System.out.println("Yıl değeri negatif olamaz!");
        }
        else               // valid year value
        {
            switch (modValue)  // compare mod12 of year with different signs
            {
                case 0:
                    System.out.println("Çin zodyağı burcunuz: 'Maymun'");
                    break;
                case 1:
                    System.out.println("Çin zodyağı burcunuz: 'Horoz'");
                    break;
                case 2:
                    System.out.println("Çin zodyağı burcunuz: 'Köpek'");
                    break;
                case 3:
                    System.out.println("Çin zodyağı burcunuz: 'Domuz'");
                    break;
                case 4:
                    System.out.println("Çin zodyağı burcunuz: 'Fare'");
                    break;
                case 5:
                    System.out.println("Çin zodyağı burcunuz: 'Öküz'");
                    break;
                case 6:
                    System.out.println("Çin zodyağı burcunuz: 'Kaplan'");
                    break;
                case 7:
                    System.out.println("Çin zodyağı burcunuz: 'Tavşan'");
                    break;
                case 8:
                    System.out.println("Çin zodyağı burcunuz: 'Ejderha'");
                    break;
                case 9:
                    System.out.println("Çin zodyağı burcunuz: 'Yılan'");
                    break;
                case 10:
                    System.out.println("Çin zodyağı burcunuz: 'At'");
                    break;
                default:
                    System.out.println("Çin zodyağı burcunuz: 'Koyun'");
                    break;
            }
            System.out.println("Burç yorumu sona erdi!");
        }
    }
}
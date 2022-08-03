import java.util.Scanner;
public class horoscope {
    public static void main(String[] args) {
        int day;
        String month;

        System.out.println("Burç hesaplayan programa hoşgeldiniz!");
        Scanner myInput = new Scanner(System.in);

        System.out.print("Hangi ayda doğdunuz: ");
        month = myInput.nextLine();
        System.out.print(month + " ayının kaçıncı günü doğdunuz: ");
        day = myInput.nextInt();

        if (day >= 1 && day <= 31) {
            if ((month.equals("aralık") && day >= 22) || (month.equals("ocak") && day <= 21)) {
                System.out.println("Burcunuz: 'Oğlak'");
            } else if ((month.equals("ocak") && day >= 22) || (month.equals("şubat") && day <= 19)) {
                System.out.println("Burcunuz: 'Kova'");
            } else if ((month.equals("şubat") && day >= 20) || (month.equals("mart") && day <= 20)) {
                System.out.println("Burcunuz: 'Balık'");
            } else if ((month.equals("mart") && day >= 21) || (month.equals("nisan") && day <= 20)) {
                System.out.println("Burcunuz: 'Koç'");
            } else if ((month.equals("nisan") && day >= 21) || (month.equals("mayıs") && day <= 21)) {
                System.out.println("Burcunuz: 'Boğa'");
            } else if ((month.equals("mayıs") && day >= 22) || (month.equals("haziran") && day <= 22)) {
                System.out.println("Burcunuz: 'İkizler'");
            } else if ((month.equals("haziran") && day >= 23) || (month.equals("temmuz") && day <= 22)) {
                System.out.println("Burcunuz: 'Yengeç'");
            } else if ((month.equals("temmuz") && day >= 23) || (month.equals("ağustos") && day <= 22)) {
                System.out.println("Burcunuz: 'Aslan'");
            } else if ((month.equals("ağustos") && day >= 23) || (month.equals("eylül") && day <= 22)) {
                System.out.println("Burcunuz: 'Başak'");
            } else if ((month.equals("eylül") && day >= 23) || (month.equals("ekim") && day <= 22)) {
                System.out.println("Burcunuz: 'Terazi'");
            } else if ((month.equals("ekim") && day >= 23) || (month.equals("kasım") && day <= 21)) {
                System.out.println("Burcunuz: 'Akrep'");
            } else if ((month.equals("kasım") && day >= 22) || (month.equals("aralık") && day <= 21)) {
                System.out.println("Burcunuz: 'Yay'");
            } else {
                System.out.println("Lütfen ay değerini küçük harflerle ve türkçe karakter ile yazın.");
            }

        } else {
            System.out.println("Lütfen geçerli 'gün' değeri girin.");
        }





    }
}

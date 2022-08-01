import java.util.Scanner;
public class mathCalculator {
    public static void main(String[] args) {
        double num1, num2;
        int operation;

        // introduce the calculator to user and define myInput
        System.out.println("Hesap makinesine hoşgeldiniz!");
        Scanner myInput = new Scanner(System.in);

        // get input for num1-num2 and operation
        System.out.println("Hangi aritmetik işlemi yapmak istiyorsunuz? Lütfen sayı giriniz!");
        System.out.print("Toplama için: 1\nÇıkarma için: 2\nÇarpma için: 3\nBölme için: 4\nSeçiminiz: ");
        operation = myInput.nextInt();
        System.out.print("İşlem yapılacak 1. sayıyı giriniz: ");
        num1 = myInput.nextDouble();
        System.out.print("İşlem yapılacak 2. sayıyı giriniz: ");
        num2 = myInput.nextDouble();

        //  decide outcome by using switch
        switch  (operation) {
            case 1:
                System.out.println("Toplam: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Fark: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpım: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bölüm: " + (num1 / num2));
                break;
            default:
                System.out.println("Lütfen işlem seçiminizi 1 ile 4 arasındaki tamsayılardan yapın!");
        }
    }
}

import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, digitNum, sum = 0;

        System.out.println("Basamak toplayıcıya hoşgeldiniz.");
        System.out.print("Hangi sayı sorgulansın: ");
        num = input.nextInt();

        while (num != 0)
        {
            digitNum = (num % 10);
            sum += digitNum;
            num /= 10;
        }
        System.out.println("Basamaklar toplamı = " + sum);
    }
}

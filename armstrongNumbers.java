import java.util.Scanner;
public class armstrongNumbers {
    public static void main(String[] args) {
        int number, power = 1, digit;
        int copyNum, copy2Num, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        number = input.nextInt();
        copyNum = number;          // disposable copies of number
        copy2Num = number;

        while (copyNum >= 10)      // check digit numbers of variable 'number'
        {
            power++;
            copyNum /= 10;
        }

        while (copy2Num != 0)     // get into every single digit of 'number'
        {
            digit = copy2Num % 10;
            int exponential = 1;
            for (int i=1; i <= power; i++)  // digit ^ power
            {
                exponential *= digit;
            }
            sum += exponential;         // sum of (digit ^ power) for all digits
            copy2Num /= 10;
        }
        if (number == sum)
        {
            System.out.println(number + " bir Armstrong sayısıdır.");
        }
        else
        {
            System.out.println("Tekrar deneyin.");
        }
        
    }
}

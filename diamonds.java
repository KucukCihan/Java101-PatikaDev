import java.util.Scanner;
public class diamonds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eşkenar Dörtgen oluşturucuya hoşgeldiniz!");

        System.out.print("Eşkenar dörtgenin kenar uzunluğunu giriniz: ");    // get height input for diamond
        int n = input.nextInt();


         // top half of diamond
        for (int i = 1; i <= n; i++)          // do below for n height
        {
            for (int j = (n-i); j >= 1; j--)  // from n-1 to 1 whitespace per line
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++)  // from 1 to 2n-1 stars per line
            {
                System.out.print("*");
            }
            System.out.println();             // go next line after printing stars
        }


         // bottom half of diamond
        for (int x = (n-1); x >= 1; x--)      // do below for n-1 height
        {
            for (int y = 1; y <= (n-x); y++)  // from 1 to n-1 whitespace per line
            {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x) - 1; z++)  // from 2(n-1)-1 to 1 stars per line
            {
                System.out.print("*");
            }
            System.out.println();             // go next line after printing stars
        }





    }
}

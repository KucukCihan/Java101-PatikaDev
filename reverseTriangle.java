import java.util.Scanner;
public class reverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgen motif oluşturucuya hoşgeldiniz!");

        System.out.print("Üçgenin yüksekliği ne kadar olsun: ");
        int h = input.nextInt();

        for (int i = 1; i <= h; i++)          // do the below for height times
        {
            for (int j = 1; j <= i; j++)      // double-whitespace i times
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * (h-i+1)) - 1; k++ )
            {
                System.out.print("* ");       // insert '*' (2 * (h-i+1) - 1) times
            }

            System.out.println();             // go to the next line after the process
        }

    }
}





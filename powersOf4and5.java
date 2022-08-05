import java.util.Scanner;
public class PowersOf4and5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaça kadar gidilsin: ");
        int peak = input.nextInt();               // define-get peak input

        System.out.print("4'ün " + peak + "'den küçük kuvvetleri: ");
        for (int i = 1; i <= peak; i *= 4)    // get forces of four
        {
            System.out.print(i + " ");        // print them for < peak
        }
        System.out.println();                 // go to next line

        System.out.print("5'in " + peak + "'den küçük kuvvetleri: ");
        for (int j = 1; j <= peak; j *= 5)    // get forces of five
        {
            System.out.print(j + " ");        // print them for < peak
        }
    }
}

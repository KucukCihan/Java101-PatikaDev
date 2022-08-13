import java.util.Scanner;
public class minus5_Plus5 {

    /* Purpose : Get input(n) type(Int) from user; subtract the n while n > 0.
    Print n values after every subtraction steps. If n <= 0 increase by 5 until
    starting n value and print every step of addition.
    Examples: n value : 16; output : 16 11 6 1 -4 1 6 11 16
              n value : 20; output : 20 15 10 5 0 5 15 20                   */

    static String minus5(int a, int b) {
        if (b <= 0) {
            return b + " " + plus5(a, b+5);   // after b <= 0 go to plus5() function
        }
        return b + " " + minus5(a, b-5);
    }
    // minus5(20,20) = 20 15 10 5 [0 + " " + plus5(20,0)]   -->  plus5(20,0) = 5 10 15 20
    static String plus5(int a, int b) {
        if (a <= b) {
            return b + "";                    // end the recursion if b >= a
        }
        return b + " " + plus5(a, b+5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = sc.nextInt();
        System.out.println("Çıktısı : " + minus5(n, n));
    }
}

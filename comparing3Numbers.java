import java.util.Scanner;
public class comparing3Numbers {
    public static void main(String[] args) {
        double num1, num2, num3;                   // double for long range of numbers including decimals
        Scanner myInput = new Scanner(System.in);

        System.out.print("Sıralamak istediğiniz ilk sayı:    ");     // get user inputs for num1...num3
        num1 = myInput.nextDouble();
        System.out.print("Sıralamak istediğiniz ikinci sayı: ");
        num2 = myInput.nextDouble();
        System.out.print("Sıralamak istediğiniz üçüncü sayı: ");
        num3 = myInput.nextDouble();

            // - equal possibilities -

        if (num1 == num2 ) {            // num1 and num2 equal possibilities
            if (num1 == num3) {
                System.out.println(num1 + " = " + num2 + " = " + num3); /// 1 = 2 = 3
            } else if (num1 > num3) {
                System.out.println(num3 + " < " + num1 + " = " + num2); /// 3 < 1 = 2
            } else {
                System.out.println(num1 + " = " + num2 + " < " + num3); /// 1 = 2 < 3
            }

        } else if (num2 == num3 ) {     // num2 and num3 equal possibilities
            if (num1 > num2) {
                System.out.println(num2 + " = " + num3 + " < " + num1); /// 2 = 3 < 1
            } else  {
                System.out.println(num1 + " < " + num2 + " = " + num3); /// 1 < 2 = 3
            }

        } else if (num1 == num3 ) {     // num1 and num3 equal possibilities
            if (num1 > num2) {
                System.out.println(num2 + " < " + num1 + " = " + num3); /// 2 < 1 = 3
            } else  {
                System.out.println(num1 + " = " + num3 + " < " + num2); /// 1 = 3 < 2
            }

            // - non-equal possibilities -

        } else if (num1 > num2) {      // num1 > num2 possibilities
            if (num2 > num3) {
                System.out.println(num3 + " < " + num2 + " < " + num1); /// 3 < 2 < 1
            } else if (num1 < num3){
                System.out.println(num2 + " < " + num1 + " < " + num3); /// 2 < 1 < 3
            } else {
                System.out.println(num2 + " < " + num3 + " < " + num1); /// 2 < 3 < 1
            }


        } else {                       // num2 > num1 possibilities
            if (num1 > num3) {
                System.out.println(num3 + " < " + num1 + " < " + num2); /// 3 < 1 < 2
            } else if (num2 < num3){
                System.out.println(num1 + " < " + num2 + " < " + num3); /// 1 < 2 < 3
            } else {
                System.out.println(num1 + " < " + num3 + " < " + num2); /// 1 < 3 < 2
            }
        }

        System.out.println("Sıralama işlemi tamamlandı!");  // notify user that program has ended

    }
}

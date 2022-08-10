import java.util.Scanner;
public class calculator {
    static double sum(double a, double b) {
        return (a + b);
    }

    static double subtract(double a, double b) {
        return (a - b);
    }

    static double multiple(double a, double b) {
        return (a * b);
    }

    static double divide(double a, double b) {
        return (a / b);
    }

    static double exponential(double a, double b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static double factorial(double a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    static double mod(double a, double b) {
        return (a % b);
    }

    static String rectangle(double a, double b) {
        double area = a * b;
        double circumference = 2 * (a + b);
        return ("Alan = " + area + "  Çevre = " + circumference);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hesap makinesine hoşgeldiniz!");
        String process;

        do {
            System.out.print("\nYapmak istediğiniz işlemi seçiniz" +
                    "\ntoplama: +\nçıkarma: -\nçarpma: *\nbölme: /" +
                    "\nüs al: ^\nfaktöriyel al: !\nmod al: mod" +
                    "\ndikdörtgen alan-çevre hesabı: #\nçıkış yap: C\ncevabınız: ");
            process = input.next();
            double first = 0, second = 0;

            if (process.equals("C")) {
                System.out.println("........." +
                        "\n###......\n######...\n#########" +
                        "\nKapatıldı!");
                break;
            } else if (process.equals("!")) {
                System.out.print("(a!) a?;\n a: ");
                first = input.nextDouble();
                System.out.print(" (" + first + "!) = ");
            } else if (process.equals("#")) {
                System.out.print("(kenarları a ve b olan dikdörtgen) a? b?;\n a: ");
                first = input.nextDouble();
                System.out.print(" b: ");
                second = input.nextDouble();
            } else {
                System.out.print("(a " + process + " b) a? b?;\n a: ");
                first = input.nextDouble();
                System.out.print(" b: ");
                second = input.nextDouble();
                System.out.print(" (" + first + " " + process + " " + second + ") = ");
            }


            switch (process) {
                case "+":
                    System.out.print(sum(first, second));
                    break;
                case "-":
                    System.out.print(subtract(first, second));
                    break;
                case "*":
                    System.out.print(multiple(first, second));
                    break;
                case "/":
                    System.out.print(divide(first, second));
                    break;
                case "^":
                    System.out.print(exponential(first, second));
                    break;
                case "!":
                    System.out.print(factorial(first));
                    break;
                case "mod":
                    System.out.print(mod(first, second));
                    break;
                case "#":
                    System.out.print(rectangle(first, second));
                    break;
                default:
                    System.out.println("Lütfen belirtilen seçenekler içinden giriş yapın!");
                    break;
            }

        } while ( !(process.equals("C")) );

    }
}




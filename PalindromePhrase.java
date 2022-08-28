import java.util.Scanner;
public class PalindromePhrase {

    public static String removeAllNonAlphaNumeric(String str) {  // removes whitespaces and non A-Z 0-9 values
        if (str == null) {
            return null;
        }
        return str.replaceAll("[\\W]+", "");
    }

    private static String reverseString(String str) {   // returns reverse of str
        String reverse = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            reverse += (str.charAt(i));
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to palindrome phrase tester!");

        System.out.print("Insert your phrase : ");                 // get phrase input
        String phrase = sc.nextLine();

        phrase = removeAllNonAlphaNumeric(phrase);                 // call func
        phrase = phrase.replace("I", "İ");        // replace I to İ so we can get i on lowercase
        phrase = phrase.toLowerCase();                           // lowercase all the letters on phrase

        System.out.println("Your phrase : " + phrase);
        System.out.println("Reverse of your phrase : " + reverseString(phrase));

        if (phrase.equals(reverseString(phrase))) {
            System.out.println("\"" + phrase + "\"" + " is a palindrome phrase");
        } else {
            System.out.println("\"" + phrase + "\"" + " isn't a palindrome," +
                    " since its not equal to " + "\"" + reverseString(phrase) + "\"");
        }

    }
}

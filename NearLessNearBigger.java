import java.util.Arrays;
import java.util.Scanner;

public class NearLessNearBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(arr));

        System.out.print("Girilen sayı : ");  // get input from arr
        int n = sc.nextInt();

        boolean contains = false;             // check if input is element of array
        for (int search : arr) {
            if (n == search) {
                contains = true;
                break;
            }
        }

        if (contains) {
            Arrays.sort(arr);                          // sort arr
            int index = Arrays.binarySearch(arr, n);   // do binarySearch, get index of n

            if (index == arr.length - 1) {             // if index of n is last index
                System.out.println(n + " sayısından küçük en yakın sayı : " + arr[index - 1]);
                System.out.println(n + " sayısı dizideki en büyük sayıdır!");

            } else if (index == 0) {                   // if index of n is first index
                System.out.println(n + " sayısı dizideki en küçük sayıdır!");
                System.out.println(n + " sayısından büyük en yakın sayı : " + arr[index + 1]);

            } else {                                   // if index is middle of somewhere in arr
                System.out.println(n + " sayısından küçük en yakın sayı : " + arr[index - 1]);
                System.out.println(n + " sayısından büyük en yakın sayı : " + arr[index + 1]);
            }

        } else {                              // if arr not contains n
            System.out.println("Lütfen dizi içerisindeki değerlerden birisini giriniz.");
        }

    }
}

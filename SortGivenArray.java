import java.util.Arrays;
import java.util.Scanner;
public class SortGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi oluşturulsun: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Dizinin tamsayı elemanlarını giriniz.");

        for (int i = 0; i < n; i++) {
            System.out.print(i + ". elemanı girin: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        StringBuilder str = new StringBuilder();
        for (int j : arr) {
            str.append(j).append(" ");
        }
        System.out.println("Sıralama: " + str);

    }
}

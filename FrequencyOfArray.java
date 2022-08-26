import java.util.Arrays;
public class FrequencyOfArray {

    static boolean isContains(int[] array, int value) {   // check if the value is in the array
        for (int search : array) {
            if (search == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20, 3}; // given array with n length
        int[] arr2 = new int[arr.length];                               // n length arr2
        int[] countArr = new int[arr.length];                           // n length counterArray
        int counter, index = 0;                                         // define counter-index

        for (int i = 0; i < arr.length; i++) {        // i is the first pointer of arr
            if (isContains(arr2, arr[i])) {           // if we saw the value before skip this part
                continue;
            } else {                                  // if this is first time we see the value
                arr2[index] = arr[i];                 // add value to arr2[index]
                counter = 1;                          // counter = 1
            }
            for (int j = 0; j < arr.length; j++) {          // j is the second pointer of arr
                if ( (i != j) && (arr[i] == arr[j]) ) {     // if we see same value on arr
                    counter++;                              // increase counter by 1
                }
                countArr[index] = counter;                // add counter to countArr[index]
            }
            index++;                                      // increase index by 1

            // System.out.println(counter + " " + Arrays.toString(arr2));
            // 3 ['10', 0, 0, 0, 0, 0, 0, 0, 0]
            // 4 [10, '20', 0, 0, 0, 0, 0, 0, 0]
            // 1 [10, 20, '5', 0, 0, 0, 0, 0, 0]
            // 1 [10, 20, 5, '3', 0, 0, 0, 0, 0]

        }

        System.out.println("Diziniz: " + Arrays.toString(arr)); // print arr
        System.out.println("Dizide sırasıyla;");
        for (int z = 0; z < index; z++) {                       // print countArr[index] "\t" arr2[index]
            System.out.println(countArr[z] + " tane " + arr2[z] + " vardır.");
        }

    }
}

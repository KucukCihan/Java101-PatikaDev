public class primeNumber {
    public static void main(String[] args) {
        /* Prime Number: A Number that can evenly divisible by only '1' and the number itself.
        Hence; primeNumber + 1 = sum of divisors
         */

        for (int n = 1; n <= 100; n++)        // search for numbers from 1-100
        {
            int sum_n_divisor = 0;
            for (int i = 1; i <= n; i++)      // check for its divisors
            {
                if (n % i == 0) {
                    sum_n_divisor += i;       // add all divisors
                }
            }

            if (sum_n_divisor == (n + 1)) {   // primeNumber condition
                System.out.print(n + " ");    // print primeNumber
            }
        }
        
    }
}

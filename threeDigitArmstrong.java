public class threeDigitArmstrong {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++)          // hundreds digit
        {
            for (int j = 0; j <= 9; j++)      // tens digit
            {
                for (int k = 0; k <= 9; k++)  // units digit
                {
                    int number = (k + (10 * j) + (100 * i));
                    int copyNumber = number;  // get copy of number

                    int digitCounter = 1;     // at least 1 digit in order to be number
                    while (copyNumber >= 10)
                    {
                        digitCounter++;       // calculated the digits of the number
                        copyNumber /= 10;
                    }
                    copyNumber = number;      // reset the copyNumber

                    int currentDigit, sum = 0; // if number is xyz -> sum = x^3 + y^3 + z^3

                    while (copyNumber != 0)   // until there is no more digits do these
                    {
                        currentDigit = (copyNumber % 10);  // check the last digit of copyNumber
                        int exponential = 1;

                        for (int l=1; l <= digitCounter; l++)
                        {
                            exponential *= currentDigit;
                        }
                        sum += exponential;   // add currentDigit^digitCounter to sum
                        copyNumber /= 10;     // delete last digit, go for next digit
                    }
                    if (number == sum)        // number = sum -> its an Armstrong number
                    {
                        System.out.println(number);
                    }

                }
            }
        }

    }
}

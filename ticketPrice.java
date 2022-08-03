import java.util.Scanner;
public class ticketPrice {
    public static void main(String[] args) {

        /* Mesafe başına ücret 0,10 TL / km
        mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
            - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
            - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */


        double costPerKM, normalCost, rateAge, discount1, rateTrip, discount2, totalCost;
        costPerKM = 0.10;
        Scanner myInput = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: "); // get distance input
        int distance = myInput.nextInt();

        if (distance >= 0) {
            normalCost = (distance * costPerKM); // price without discount

            System.out.print("Yaşınızı giriniz: "); // get age input
            byte age = myInput.nextByte();


            if (age > 0)                        // valid age input runs all the below
            {
                // age discounts
                if (age >= 65) { rateAge = 0.70;
                } else if (age >= 12 && age <= 24) { rateAge = 0.90;
                } else if (age < 12) { rateAge = 0.50;
                } else { rateAge = 1;

                }
                discount1 = (normalCost * rateAge);  // price with age discount

                System.out.print("Yolculuk tipini ('1' => Tek-yön, '2' => Gidiş-dönüş) giriniz: ");
                byte tripType = myInput.nextByte();     // get tripType input

                // tripType discounts
                if ((tripType == 1) || (tripType == 2))  // valid tripType input runs all the below
                {
                    rateTrip = (tripType == 2)? 0.80:1.00; // discount for round-trip

                    discount2 = (discount1 * rateTrip);   // price with tripType and age discount

                    totalCost = (discount2 * tripType);  // totalcost = (price * ticket amount)

                    System.out.println("Toplam Tutar: " + totalCost);  // print final price

                }

                else      // invalid tripType input
                {
                    System.out.println("Hatalı veri girdiniz!");
                }

            }

            else      // invalid age input
            {
                System.out.println("Lütfen geçerli yaş giriniz.");
            }

        }

        else      // invalid distance input
        {
            System.out.println("Mesafe değeri negatif olamaz!");
        }

        
    }
}

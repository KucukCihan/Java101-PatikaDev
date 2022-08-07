import java.util.Scanner;
public class atmMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String realUserName, realPassword, userName, password;
        realUserName = "admin";      // assign realUserName as 'admin'
        realPassword = "cypher";     // assign realPassword as 'cypher'
        int chance = 3;              // user has 3 chances to enter correctly
        int balance = 1500;          // user has 1500 coins
        boolean goAgain = true;
        int action;

        System.out.println("Bankamatiğe hoşgeldiniz");
        while ((chance > 0) && (goAgain))   // do the following until user is out of chance
        {
            System.out.print("Kullanıcı adınız: ");  // ask for username and password
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals(realUserName) && password.equals(realPassword)) {  // do the below if username
                System.out.println("Merhaba, " + realUserName);                    // and password correct
                do
                {
                    System.out.println("1: Para Yatır\n2: Para Çek\n" +
                           "3: Bakiye Sorgula\n4: Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    action = input.nextInt();           // let user choose the type of action
                    switch (action)
                    {
                        case 1:
                            System.out.print("Yatırdığınız para miktarı: ");
                            int deposit = input.nextInt();
                            balance += deposit;         // if user deposits -> balance will increase
                            System.out.println("Para yatırıldıktan sonraki bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Bakiyeniz: " + balance);
                            System.out.print("Çekeceğiniz tutar: ");
                            int withdraw = input.nextInt();
                            int amountBalance = (balance >= withdraw)? 1:0; // (withdraw >? balance)
                            switch (amountBalance)
                            {
                                case 1:                 // (withdraw <= balance)
                                    balance -= withdraw;
                                    break;
                                case 0:                 // (withdraw > balance)
                                    System.out.println("Yetersiz bakiye!");
                                    break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);  // check the balance
                            break;
                        case 4:                         // leave the bank
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler, görüşmek üzere!");
                            goAgain = false;
                            break;
                        default:                        // invalid action selection
                            System.out.println("Lütfen 1-4 arasında numara tuşlayınız.");
                            break;
                    }

                } while (action != 4);
                break;

            } else {             // do the following if username or password is incorrect
                chance--;
                switch (chance)
                {
                    case 0:      // no more chance to try
                        System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                        break;
                    default:     // warning message
                        System.out.println("Hatalı kullanıcı adı veya şifre, tekrar deneyiniz.");
                        System.out.println("Kalan hakkınız: " + chance);
                }
            }

        }

    }
}

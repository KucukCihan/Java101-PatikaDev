import java.util.Scanner;
public class sifreDegistirici {
    public static void main(String[] args) {
        String realUserName, realPassword, userName, password, pwChange, newPassword;
        realUserName = "admin";    // assign realUserName as 'admin'
        realPassword = "cypher";   // assign realPassword as 'cypher'
        Scanner myInput = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: "); // get input for username comparison
        userName = myInput.nextLine();

        System.out.print("Şifreniz: ");       // get input for password comparison
        password = myInput.nextLine();

        // compare inputs and real id-pw
        if ((userName.equals("admin")) && (password.equals(realPassword))) { // correct id-pw, login
            System.out.println("Giriş başarılı!");
        } else if (userName.equals("admin")) { // correct id but incorrect pw
            System.out.println("Şifreyi yanlış girdiniz!");
            System.out.println("Şifrenizi değiştirmek istiyorsanız 'evet' yazın."); // ask for pw reset
            pwChange = myInput.nextLine();
            if ((pwChange.equals("evet"))) {                             // get newPassword input
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = myInput.nextLine();
                if ((newPassword.equals(realPassword)) || (newPassword.equals(password))) { // invalid pw reset
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                    realPassword = newPassword;                  // realPassword has been changed
                    System.out.println("Yeni şifreniz: "+realPassword);
                }
            } else {            // user doesnt want to reset password
                System.out.println("Şifrenizi sıfırlama işlemi kapandı.");
            }
        }  else {  // incorrect id-pw
            System.out.println("Geçersiz kullanıcı adı ve şifre, lütfen tekrar deneyin!");
        }
    }
}

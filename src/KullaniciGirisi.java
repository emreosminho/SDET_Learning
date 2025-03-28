import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz:");
        username = input.nextLine();
        System.out.println("Şifre Giriniz:");
        password = input.nextLine();

        if(username.equals("emro22") && password.equals("123321")) {
            System.out.println("Kullanici basarili giris yapti");
        } else {
            System.out.println("Basarisiz giris...");
        }
    }
}

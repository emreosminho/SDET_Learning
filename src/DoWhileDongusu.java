import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.print("Şifre giriniz: ");
            pass = input.nextInt();
            if (pass == 123){
                System.out.println("dogru");
                askPassword = false;
            }else {
                System.out.println("yanlis");
            }
        } while (askPassword);
    }
}

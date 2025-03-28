import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args){
        int sayi, sayiUssu;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü hesaplanacak sayi giriniz: ");
        sayi = input.nextInt();
        System.out.print("Üssü ne olacak: ");
        sayiUssu = input.nextInt();
        int total = 1;

        for (int i = 1; i<=sayiUssu; i++){
            total *= sayi;
        }
        System.out.println("sonuc: " + total);

    }
}

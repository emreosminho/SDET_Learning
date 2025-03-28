import java.util.Scanner;

public class KdvHesaplama {
    public static void main (String[] args) {
        double netFiyat, kdvFiyat, kdvTutari;
        Scanner input = new Scanner(System.in);
        System.out.print("Net tutarı giriniz: ");
        netFiyat = input.nextInt();
        kdvFiyat = netFiyat + ((netFiyat * 18)/100);
        System.out.println("KDV'li tutarı: " + kdvFiyat);
        kdvTutari = kdvFiyat - netFiyat;
        System.out.println("Kdv tutarı: " + kdvTutari);
    }
}

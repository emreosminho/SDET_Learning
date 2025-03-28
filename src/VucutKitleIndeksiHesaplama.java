import java.util.Scanner;

public class VucutKitlEndeksiHesaplama {
    public static void main (String[] args) {
        double boy, kilo, endeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(metre cinsi): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        endeks = kilo / (boy*boy);
        System.out.print("Vücut kitle endeksi: " + endeks);
    }
}

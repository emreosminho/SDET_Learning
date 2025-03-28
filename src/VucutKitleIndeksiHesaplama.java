import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main (String[] args) {
        double boy, kilo, indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(metre cinsi): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        indeks = kilo / (boy*boy);
        System.out.print("Vücut kitle indeksi: " + indeks);
    }
}

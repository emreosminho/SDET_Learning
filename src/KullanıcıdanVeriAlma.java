import java.util.Scanner;

public class KullanıcıdanVeriAlma {
    public static void main (String[] args) {
        // Kullanıcıdan değer alma
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        a = input.nextInt();
        System.out.println(a);

        System.out.print("b sayisi giriniz:");
        double b = input.nextDouble();
        System.out.println(b);

    }
}

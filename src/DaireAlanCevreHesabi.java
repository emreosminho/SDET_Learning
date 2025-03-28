import java.util.Scanner;

public class DaireAlanCevreHesabi {
    public static void main (String[] args) {
        double pi = 3.14, r, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r = input.nextDouble();
        cevre = 2 * pi * r;
        alan = pi * r * r;
        System.out.println("Dairenin cevresi: " + cevre);
        System.out.println("Dairenin alani: " + alan);

    }
}

import java.util.Scanner;

public class TaksimetreHesabi {
    public static void main (String[] args) {
        double km, prPrice = 2.20, total, startPrice = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidicelecek mesafeyi giriniz km cinsinden: ");
        km = input.nextDouble();
        total = (km * prPrice);
        total += startPrice;


        total = (total < 20) ? 20 : total;
        System.out.println("Ödenecek Tutar: " + total);
    }
}

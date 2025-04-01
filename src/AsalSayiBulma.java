import java.util.Scanner;

public class AsalSayiBulma {
    // Recursive asal sayı kontrolü
    static boolean asalSayi(int a, int i) {
        if (a < 2) {
            return false; // 2'den küçük sayılar asal değildir
        }
        if (i == 1) {
            return true; // 1'e kadar bölünmeden geldiyse asaldır
        }
        if (a % i == 0) {
            return false; // Eğer tam bölünürse asal değildir
        }
        return asalSayi(a, i - 1); // Bir küçük böleni kontrol et
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        if (asalSayi(number, number - 1)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " asal değildir.");
        }
    }
}

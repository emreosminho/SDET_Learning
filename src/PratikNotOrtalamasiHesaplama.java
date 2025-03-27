import java.util.Scanner;

public class PratikNotOrtalamasiHesaplama {
    public static void main (String[] args) {

        double mat, kim, fiz, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Matamatik sınavı:");
        mat = input.nextDouble();
        System.out.print("Kimya sınavı:");
        kim = input.nextDouble();
        System.out.print("Fizik sınavı:");
        fiz = input.nextDouble();
        sonuc = (mat+kim+fiz)/3;
        System.out.println("Ortalama: " + sonuc);
        if (sonuc > 50) {
            System.out.println("Gecti");
        }
    }
}

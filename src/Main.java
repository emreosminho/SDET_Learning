//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Temel Kavramlar ve Değişkenler
        int numberOne, numberTwo = 2, numberThree;
        numberOne = 1;
        numberThree = numberOne + numberTwo;
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);

        // Kare çevre ve alan hesaplama
        int kisaKenar = 20;
        int uzunKenar = 40;
        int alan = kisaKenar * uzunKenar;
        int cevre = 2*kisaKenar + 2*uzunKenar;

        System.out.println("Kare Alanı: " + alan);
        System.out.println("Kare Çevresi: " + cevre);

        // Tam Sayılar -> Byte, Short, Integer, Lon,
        // Ondalık Sayılıar -> Float, Double
        // Karakter -> Char
        // Mantıksal Degerler -> Boolean

    }
}

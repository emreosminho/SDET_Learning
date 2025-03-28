import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args){
        String islem;
        double a,b,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        a = input.nextDouble();
        System.out.print("İkinci sayiyi gitiniz: ");
        b = input.nextDouble();

        input.nextLine();

        System.out.println("İslem türü giriniz: +, -, /, * ");
        islem = input.nextLine();

        switch (islem){
            case "+":
                sonuc = a + b;
                System.out.print("İşlem sonucu: " + sonuc);
                break;
            case "-":
                sonuc = a - b;
                System.out.print("İşlem sonucu: " + sonuc);
                break;
            case "/":
                sonuc = a / b;
                System.out.print("İşlem sonucu: " + sonuc);
                break;
            case "*":
                sonuc = a * b;
                System.out.print("İşlem sonucu: " + sonuc);
                break;
        }
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class DikUcgenHipotenusHesabi {
    public static void main (String[] args) {
       /* Hipotenus hesabı
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus: " + c); */


        // Üçgenin alanı çevresi hesabı
        int a,b,c,d,e;
        double f;
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar uzunlugu: ");
        a = input.nextInt();
        System.out.print("2. kenar uzunlugu: ");
        b = input.nextInt();
        System.out.print("3. kenar uzunlugu: ");
        c = input.nextInt();

        d = (a+b+c);
        System.out.println("Üçgenin çevresi: " + d);

        e = (d/2) * ((d/2)-a) * ((d/2)-b) * ((d/2)-c);
        f = Math.sqrt(e);
        System.out.println("Üçgenin alanı: " + f);



    }
}

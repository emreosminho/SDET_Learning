import java.util.Scanner;

public class OdevUcakBiletiHesaplama {
    public static void main(String[] args){
        int mesafe, yas, yolculukTipi;
        double mesafeKatsayi = 0.10, toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuk tipi seçiniz Gidiş: 1 / Gidiş-Dönüş: 2: ");
        yolculukTipi = input.nextInt();
        System.out.print("Mesafe giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        toplamTutar = mesafe * mesafeKatsayi;


        switch (yolculukTipi){
            case 1:
                if (yas<12){
                    toplamTutar = toplamTutar * 0.5;
                    System.out.print("Bilet tutarı: " + toplamTutar + " TL");
                } else if (yas>=12 && yas<24) {
                    toplamTutar = toplamTutar - (toplamTutar * 0.1);
                    System.out.print("Bilet Tutarı: " + toplamTutar + " TL");
                } else if (yas>65) {
                    toplamTutar = toplamTutar - (toplamTutar * 0.3);
                    System.out.print("Bilet Tutarı: " + toplamTutar + " TL");
                }
            case 2:
                if (yas<12){
                    toplamTutar = toplamTutar * 0.5 - (toplamTutar*0.2);
                    System.out.print("Bilet tutarı: " + toplamTutar + " TL");
                } else if (yas>=12 && yas<24) {
                    toplamTutar = toplamTutar - (toplamTutar * 0.1) - (toplamTutar*0.2);
                    System.out.print("Bilet Tutarı: " + toplamTutar + " TL");
                } else if (yas>=24 && yas<65) {
                    toplamTutar = toplamTutar - (toplamTutar * 0.1) - (toplamTutar*0.2);
                    System.out.print("Bilet Tutarı: " + toplamTutar + " TL");
                } else {
                    toplamTutar = toplamTutar - (toplamTutar * 0.3) - (toplamTutar*0.2);
                    System.out.print("Bilet Tutarı: " + toplamTutar + " TL");
                }
        }
    }
}

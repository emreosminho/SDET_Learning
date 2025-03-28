import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args){
        int month, day;
        Scanner  input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day>=1 && day<=31){
                    if (day<22){
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz...");
                }
            case 2:
                if (day>=1 && day<=28){
                    if (day<20){
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz...");
                }
            case 3:
                if (day>=1 && day<=31){
                    if(day<22){
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Koç Burcu");
                    }
                } else {
                    System.out.println("Geçersiz gün girdiniz...");
                }
        }
    }
}

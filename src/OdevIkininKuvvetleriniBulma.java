import java.util.Scanner;

public class OdevIkininKuvvetleriniBulma {
    public static void main(String[] args){
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen sayıya kadar 2'nin kuvvetlerini yaz: ");
        sayi = input.nextInt();

        for (int i = 1; i<=sayi; i*=2){
            System.out.println(i);
        }
    }
}

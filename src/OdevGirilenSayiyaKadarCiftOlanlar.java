import java.util.Scanner;
public class OdevGirilenSayiyaKadarCiftOlanlar {
    public static void main(String[] args){
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        k = input.nextInt();

        for (int i = 0; i<=k; i++){
            if (i%2 != 1){
                System.out.print(i + ",");
                continue;
            }
        }
    }

}

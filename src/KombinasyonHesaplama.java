import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args){
        int n,r,nFak = 1,rFak = 1,kFak = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n sayisini giriniz: ");
        n = input.nextInt();
        System.out.print("r sayisini giriniz: ");
        r = input.nextInt();

        for (int i = 1; i<=n; i++){
            nFak *= i;
        }
        System.out.println("n!: " + nFak);

        for (int i = 1; i<=r; i++){
            rFak *= i;
        }
        System.out.println("r!: " + rFak);

        for (int i = 1; i<=n-r; i++){
            kFak *= i;
        }
        System.out.println("(n-r)!: " + kFak);

        int sonuc = nFak / (rFak * (kFak));
        System.out.print("C(n,r): " + sonuc);

    }
}

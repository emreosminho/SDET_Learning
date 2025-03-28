import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args){
        int fak = 1, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel hesaplanacak sayi: ");
        k = input.nextInt();

        for (int i = 1; i<=k; i++){
            fak *= i;
        }
        System.out.println(k + " 'in faktoriyeli: " + fak);
    }
}

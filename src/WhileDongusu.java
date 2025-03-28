import java.util.Scanner;

public class WhileDongusu {
    public static void main (String[] args){
        /* int i = 1;
        System.out.println("program basladı");
        while (i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("program bitti"); */

        /* int i = 1, k;
        while(i <= 5){
            System.out.println(i);
            k = 1;
            while (k<=10){
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
            i++;
        } */

        boolean isPasswordSucces = true;
        int password;

        Scanner input = new Scanner(System.in);

        while (isPasswordSucces){
            System.out.print("Password giriniz: ");
            password = input.nextInt();
            if (password == 123){
                System.out.println("Dogru");
                isPasswordSucces = false;
            } else {
                System.out.println("yanlis");
            }
        }

    }
}

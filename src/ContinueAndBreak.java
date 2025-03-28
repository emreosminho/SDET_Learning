import java.util.Scanner;

public class ContinueAndBreak {
    public static void main (String[] args) {

        /* break
        for (int i = 1; i<=10; i++){
            if (i==5){
                System.out.println("i degeri 5'tir");
                break;
            }
            System.out.println(i);
        } */

        // continue
        for (int i = 1; i<=10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
      int day;
        Scanner input = new Scanner(System.in);
        System.out.print("Gün numarası giriniz: ");
        day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Pazar");
        }

    }
}


public class LoopsDemo {

	public static void main(String[] args) {
		
		// For
		System.out.println("For döngüsü:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Sayac: " + i);
        }
        
        // While
        System.out.println("While döngüsü:");

        int j = 1;
        while (j <= 5) {
            System.out.println("Sayac: " + j);
            j++;
        }
        
        System.out.println("Do-While döngüsü:");

        int k = 1;
        do {
            System.out.println("Sayac: " + k);
            k++;
        } while (k <= 5);

	}

}

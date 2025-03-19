
public class ArrayDemo {

	public static void main(String[] args) {
		
		 // Bir dizi oluşturuluyor ve 5 eleman ekleniyor
        int[] numbers = {1, 2, 3, 4, 5};

        // Dizinin elemanlarını ekrana yazdırmak için bir döngü kullanılıyor
        System.out.println("Dizi elemanları:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Eleman " + (i + 1) + ": " + numbers[i]);
        }
        
        // Dizinin toplamını hesaplamak
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Dizinin toplamı: " + sum);

	}

}

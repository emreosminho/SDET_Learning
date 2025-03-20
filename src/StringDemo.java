
public class StringDemo {

	public static void main(String[] args) {
		// String tanımlama
		String text = "Java ile string islemleri";
		
		// Uzunluk alma
		System.out.println("Metin uzunlugu: " + text.length());
		
		// Küçük harfe çevirme
		System.out.println("Kucuk harf: " + text.toLowerCase());
		
		// Büyük harf
		System.out.println("Buyuk harf: " + text.toUpperCase());
		
		// Belirli bir karakteri alma
		System.out.println("İlk karakteri alma: " + text.charAt(0));
		
		// Degistirilmis metin
		System.out.println("Değiştirilmiş metin: " + text.replace("Java", "Python"));

	}

}

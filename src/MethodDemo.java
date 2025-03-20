
public class MethodDemo {
	
	
	// Toplama methodu 
	public static int toplama(int a,int b) {
		return a + b;
	}
	
	// Faktoriyel hesaplama
	public static int faktoriyel(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * faktoriyel(n-1);
	}

	public static void main(String[] args) {
		

		
		int sonuc = toplama(5,10);
		System.out.println("toplama sonucu: " + sonuc);
		int faktoriyelSonucu = faktoriyel(5);
		System.out.println("Faktoriyel sonucu: " + faktoriyelSonucu);

	}

}

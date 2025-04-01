public class MetotPalindromSayi {

    static boolean isPolidrom(int number){
        //Polidrom Sayi Hesaplama
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            System.out.println(reverseNumber);
        }
        return true;

    }

    public static void main(String[] args){
        isPolidrom(247);


    }
}

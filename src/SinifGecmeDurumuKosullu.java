import java.util.Scanner;

public class SinifGecmeDurumuKosullu {
    public static void main(String[] args){
        int fiz, kim, bio, mat, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("Fizik sınav sonucu: ");
        fiz = input.nextInt();
        System.out.print("Kimya sınav sonucu: ");
        kim = input.nextInt();
        System.out.print("Biyoloji sınav sonucu: ");
        bio = input.nextInt();
        System.out.print("Matamatik sınav sonucu: ");
        mat = input.nextInt();

        sonuc = (fiz + kim + bio + mat)/4;

        if (sonuc<45){
            System.out.println("Öğrenci Kaldı");
        } else if (sonuc>=45 && sonuc<60) {
            System.out.println("Öğrenci geçti 'Orta'");
        } else if (sonuc>=60 && sonuc<85) {
            System.out.println("Öğrenci geçti 'İyi'");
        }else {
            System.out.println("Öğrenci geçti 'Pek İyi'");
        }
    }
}

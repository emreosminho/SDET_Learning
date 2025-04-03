import java.util.Arrays;

public class DizideMinMaxBulma {
    public static void main(String[] args){
        int[] dizi = {1,563,85,-658,56,5,8555};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("İlk eleman: " + dizi[0]);
        System.out.println("Son eleman: " + dizi[dizi.length-1]);

    }
}

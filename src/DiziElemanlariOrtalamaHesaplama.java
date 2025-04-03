public class DiziElemanlariOrtalamaHesaplama {
    public static void main(String[] args){
        int toplam = 0;
        int[] liste = {1,2,3};
        for(int i : liste){
            toplam += i;
        }
        System.out.println("Dizi Elemanları Ortalaması: " + toplam/(liste.length));
    }
}

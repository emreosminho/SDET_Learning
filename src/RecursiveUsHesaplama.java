public class RecursiveUsHesaplama {
    static int usHesaplama(int taban, int us){
        int sonuc=1;
        for (int i = 1 ; i<=us; i++){
            sonuc *= taban;
        }
        return sonuc;
    }
    public static void main(String [] args){
        System.out.println(usHesaplama(5,2));
    }
}

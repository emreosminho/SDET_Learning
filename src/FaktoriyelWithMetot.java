public class FaktoriyelWithMetot {
    static int fak(int sayi){
        int fakHesap = 1;
        for (int i = 1; i<=sayi; i++){
            fakHesap *= i;
        }
        return fakHesap;
    }
    public static void main(String[] args){
        System.out.println(fak(3));
    }
}

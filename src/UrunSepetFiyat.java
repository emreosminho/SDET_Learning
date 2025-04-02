public class UrunSepetFiyat {
    String name;
    int adet;
    int fiyat;

    UrunSepetFiyat(String name, int adet, int fiyat){
        this.name = name;
        this.adet = adet;
        this.fiyat = fiyat;
    }

    void fiyatHesap(){
        if (adet>=3 && fiyat>=200){
            this.fiyat = this.fiyat - (this.fiyat*20/100);
            System.out.println("İndirimli - Tutar: " + fiyat);
        } else {
            System.out.println(this.fiyat);
        }
    }

    public static void main(String[] args){
        UrunSepetFiyat urun1 = new UrunSepetFiyat("Bardak", 3, 200);
        urun1.fiyatHesap();
    }

}

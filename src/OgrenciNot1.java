public class OgrenciNot1 {
    String name, ogrenciNo;
    int mat;
    int kim;
    int fiz;
    double ortalama;

    OgrenciNot1(String name, String ogrenciNo, int kim, int fiz, int mat){
        this.name = name;
        this.ogrenciNo = ogrenciNo;
        this.kim = kim;
        this.mat = mat;
        this.fiz = fiz;
    }

    public void ortalama(){
        ortalama = (fiz + kim + mat)/3;
        if(ortalama > 45) {
            System.out.println("GEÇTİ - Ogrenci Ortalaması: " + ortalama);
        } else {
            System.out.println("KALDI - Ogrenci Ortalaması: " + ortalama);
        }
    }

    public static void main(String[] args){
        OgrenciNot1 ogr1 = new OgrenciNot1("Emre", "808", 60,60,60);
        ogr1.ortalama();

    }

}

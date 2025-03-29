public class ReturnVoid {
    static int sum(int a, int b){
        return a + b;
    }
    // void metot
    static void bol(int c, int d){
        int result = c/d;
        System.out.println(result);
    }

    public static void main(String[] args){
        int sonuc = sum(5,7);
        System.out.println(sonuc);

        bol(8,4);
    }
}

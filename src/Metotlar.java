public class Metotlar {
    static int power(int base, int exp){
        int result=1;
        for(int i = 0; i<=exp; i++){
            result *= base;
        }
        return result;
    }
    public static void main (String[] args){
        int a = power(3,3);
        System.out.println(a);
    }
}

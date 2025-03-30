public class MetotOverloading {
    static void print(){
        System.out.println("Parametresiz");
    }

    static void print(int a){
        System.out.println("parametreler: " + a);
    }
    public static void main(String[] args){
        print();
        print(4);
    }
}

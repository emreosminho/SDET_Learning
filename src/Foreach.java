public class Foreach {
    public static void main(String[] args){
        int[] list = {1,2,3,4,5};

         /* for (int i = 0; i<=list.length; i++){
            System.out.println(list[i]);
        } */

        /* for (int i: list){
            System.out.println((i-1) + "'inci indexte: " + i);
        }

        int sum = 0;
        for (int i: list){
            sum += i;
        }
        System.out.println("Dizi elemanları toplamaı: " + sum); */

        String[] araclar = {"Audi", "Bmw", "Tofas"};
        for (String str: araclar){
            System.out.println(str);
        }

    }
}

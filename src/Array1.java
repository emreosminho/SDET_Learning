public class Array1 {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        int[] list1 = {10,20,30,40};
        double[] list2 = {1.1,2.2,3.3,4.4};
        printArray(list2);

    }
}

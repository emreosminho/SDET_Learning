public class VeriTipleri2 {
    public static void main(String[] arhs) {

        byte vByte = 100; // max 127, min -128
        System.out.println(vByte);

        short vShort = 1000; // max 32767 min -32768
        System.out.println(vShort);

        long vLong = 25652845;
        System.out.println(vLong);

        // integer en optimize en cok kullanılan değer aralığında olduğu için tercih ediyoruz.
    }
}

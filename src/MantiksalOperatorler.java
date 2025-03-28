public class MantiksalOperatorler {
    public static void main(String[] args) {
        // ve &&, veya ||
        int a = 60, b = 20, c = 50, d;
        boolean kosul1 = (c>b) && (c>a);
        boolean kosul2 = (a>c) && (a>b);
        boolean sonuc = kosul1 || kosul2;
        boolean sonuc2 = kosul1 || kosul2;
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc);
        System.out.println(!sonuc2);

        d = (a==b) ? 2 : 3;
        System.out.println(d);

    }
}

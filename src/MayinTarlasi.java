import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    private final int satir;
    private final int sutun;
    private final String[][] oyunTahtasi;
    private final String[][] mayinlar;
    private final boolean[][] acilanHücreler;
    private final int mayinSayisi;
    private boolean oyunDevam = true;
    private int kalanHücreler;

    public MayinTarlasi(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
        this.mayinSayisi = (satir * sutun) / 4; // Mayın sayısı toplam hücrelerin 1/4'ü kadar
        this.kalanHücreler = (satir * sutun) - mayinSayisi;

        this.oyunTahtasi = new String[satir][sutun];
        this.mayinlar = new String[satir][sutun];
        this.acilanHücreler = new boolean[satir][sutun];

        oyunTahtasiOlustur();
        mayinlariYerlestir();
    }

    private void oyunTahtasiOlustur() {
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                oyunTahtasi[i][j] = "-";
                mayinlar[i][j] = "-";
                acilanHücreler[i][j] = false;
            }
        }
    }

    private void mayinlariYerlestir() {
        Random rand = new Random();
        int sayac = 0;
        while (sayac < mayinSayisi) {
            int x = rand.nextInt(satir);
            int y = rand.nextInt(sutun);
            if (!mayinlar[x][y].equals("*")) {
                mayinlar[x][y] = "*";
                sayac++;
            }
        }
    }

    private void tahtaGoster(boolean mayinlariGoster) {
        System.out.println("\nMayın Tarlası:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (mayinlariGoster) {
                    System.out.print(mayinlar[i][j] + " ");
                } else {
                    System.out.print(oyunTahtasi[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private int cevredekiMayinlariSay(int x, int y) {
        int mayinSayisi = 0;
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        for (int i = 0; i < 8; i++) {
            int yeniX = x + dx[i];
            int yeniY = y + dy[i];

            if (yeniX >= 0 && yeniX < satir && yeniY >= 0 && yeniY < sutun) {
                if (mayinlar[yeniX][yeniY].equals("*")) {
                    mayinSayisi++;
                }
            }
        }
        return mayinSayisi;
    }

    public void oyunuBaslat() {
        Scanner scanner = new Scanner(System.in);
        while (oyunDevam) {
            tahtaGoster(false);
            System.out.print("\nSatır Girin: ");
            int x = scanner.nextInt();
            System.out.print("Sütun Girin: ");
            int y = scanner.nextInt();

            if (x < 0 || x >= satir || y < 0 || y >= sutun) {
                System.out.println("Geçersiz konum, tekrar deneyin!");
                continue;
            }

            if (acilanHücreler[x][y]) {
                System.out.println("Bu hücre zaten açıldı!");
                continue;
            }

            if (mayinlar[x][y].equals("*")) {
                System.out.println("\nBOOM! Mayına bastınız. Oyun bitti!");
                oyunDevam = false;
                tahtaGoster(true);
                break;
            } else {
                int mayinSayisi = cevredekiMayinlariSay(x, y);
                oyunTahtasi[x][y] = String.valueOf(mayinSayisi);
                acilanHücreler[x][y] = true;
                kalanHücreler--;

                if (kalanHücreler == 0) {
                    System.out.println("\nTebrikler! Tüm güvenli hücreleri açtınız, oyunu kazandınız!");
                    oyunDevam = false;
                    tahtaGoster(true);
                    break;
                }
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satir = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        MayinTarlasi oyun = new MayinTarlasi(satir, sutun);
        oyun.oyunuBaslat();
    }
}


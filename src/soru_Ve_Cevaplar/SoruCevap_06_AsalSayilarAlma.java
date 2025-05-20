package soru_Ve_Cevaplar;

import java.util.ArrayList;

public class SoruCevap_06_AsalSayilarAlma {

    public static void main(String[] args) {
        ArrayList<Integer> asalSayilar = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            if (isAsal(i)) {
                asalSayilar.add(i);
            }
        }

        System.out.println("Asal Sayılar: " + asalSayilar);
    }

    public static boolean isAsal(int sayi) {
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) return false;
        }
        return true;
    }
}

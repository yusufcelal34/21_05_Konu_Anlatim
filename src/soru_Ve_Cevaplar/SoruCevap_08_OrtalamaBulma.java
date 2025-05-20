package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Arrays;

public class SoruCevap_08_OrtalamaBulma {
    public static void main(String[] args) {
        ArrayList<Double> sayilar = new ArrayList<>(Arrays.asList(70.0, 85.5, 90.0, 60.0, 75.5));
        double toplam = 0;

        for (double sayi : sayilar) {
            toplam += sayi;
        }

        double ortalama = toplam / sayilar.size();
        System.out.println("Ortalama: " + ortalama);
    }
}

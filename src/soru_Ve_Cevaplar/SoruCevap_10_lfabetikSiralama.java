package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SoruCevap_10_lfabetikSiralama {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>(Arrays.asList("muz", "elma", "armut", "karpuz", "çilek"));

        Collections.sort(meyveler);
        System.out.println("Alfabetik sıralı: " + meyveler);
    }
}

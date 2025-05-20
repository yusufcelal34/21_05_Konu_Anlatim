package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Arrays;

public class SoruCevap_09_EnUzunKelime {
    public static void main(String[] args) {
        ArrayList<String> kelimeler = new ArrayList<>(Arrays.asList("elma", "armut", "çilek", "ananas", "karpuz"));
        String enUzun = "";

        for (String kelime : kelimeler) {
            if (kelime.length() > enUzun.length()) {
                enUzun = kelime;
            }
        }

        System.out.println("En uzun kelime: " + enUzun);
    }
}

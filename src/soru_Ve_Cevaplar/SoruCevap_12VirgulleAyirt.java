package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Arrays;

public class SoruCevap_12VirgulleAyirt {
    public class VirgulleYazdir {
        public static void main(String[] args) {
            ArrayList<String> liste = new ArrayList<>(Arrays.asList("Java", "Python", "C#", "Kotlin"));

            String sonuc = String.join(", ", liste);
            System.out.println("Diller: " + sonuc);
        }
    }
}
package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SoruCevap_05_TekrarEdenElemanlariSil {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>(Arrays.asList("elma", "armut", "elma", "muz", "armut"));
        System.out.println("Orijinal Liste: " + liste);

        Set<String> benzersiz = new LinkedHashSet<>(liste);
        liste = new ArrayList<>(benzersiz);

        System.out.println("Tekrarsız Liste: " + liste);
    }

}

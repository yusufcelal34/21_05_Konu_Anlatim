package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoruCevap_02_TekrarEdenKelimeler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> kelimeler = new ArrayList<>();
        System.out.println("Tekrar eden kelimler giriniz : ");

        for (int i = 0; i <= 6; i++) {
            System.out.print((i + 1) + ". kelimeyi girin: ");
            String kelime = scanner.nextLine();
            kelimeler.add(kelime);
            System.out.println(kelime + " listeye eklendi.");
        }

        System.out.println(kelimeler + "\n ");

            Set<String> tekrarEdenler = new HashSet<>(); // Tekrar kelimler
            Set<String> kontrolSeti = new HashSet<>(); // Liste kontrol

            for (String girilenKelime : kelimeler) {
                if (!kontrolSeti.add(girilenKelime)) {
                    tekrarEdenler.add(girilenKelime);
                }
            }

            System.out.println("Tekrar eden kelimeler: " + tekrarEdenler);


        }
    }



package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SoruCevap_07_EnYuksekEnDusukNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("5 not girin:");
        for (int i = 0; i < 5; i++) {
            notlar.add(scanner.nextInt());
        }

        int enYuksek = Collections.max(notlar);
        int enDusuk = Collections.min(notlar);

        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);
    }
}

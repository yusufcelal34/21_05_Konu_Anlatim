package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Scanner;

public class SoruCevap_04_CiftSayilar_YeniListeEkle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> ciftler = new ArrayList<>();

        System.out.println("5 sayı girin:");
        for (int i = 0; i < 5; i++) {
            int sayi = scanner.nextInt();
            sayilar.add(sayi);
            if (sayi % 2 == 0) {
                ciftler.add(sayi);
            }
        }

        System.out.println("Çift sayılar: " + ciftler);

    }
}

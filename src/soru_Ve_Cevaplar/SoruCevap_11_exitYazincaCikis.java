package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Scanner;

public class SoruCevap_11_exitYazincaCikis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> kelimeler = new ArrayList<>();

        while (true) {
            System.out.print("Kelime girin (çıkmak için 'exit'): ");
            String giris = scanner.nextLine();
            if (giris.equalsIgnoreCase("exit")) break;
            kelimeler.add(giris);
        }

        System.out.println("Girilen kelimeler: " + kelimeler);
    }

}

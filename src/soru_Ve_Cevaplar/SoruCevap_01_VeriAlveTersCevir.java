package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Scanner;

public class SoruCevap_01_VeriAlveTersCevir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimler = new ArrayList<>();

        // 5 isim al
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". ismi girin: ");
            String isim = scanner.nextLine();
            isimler.add(isim);
            System.out.println(isim + " listeye eklendi.");
        }

        System.out.println(isimler + "\n ");

        // Ters sırada yazdır
        System.out.println("\nTers sırada isimler:\n");
        for (int i = isimler.size() - 1; i >= 0; i--) {
            System.out.print(isimler.get(i) +" ");
        }

        scanner.close();
    }
}

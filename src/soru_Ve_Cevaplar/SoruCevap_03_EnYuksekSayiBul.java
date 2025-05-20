package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoruCevap_03_EnYuksekSayiBul {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> sayilar = new ArrayList<>(List.of(5, 23, 8));
        int max = sayilar.get(0);
        for(int s : sayilar) if(s > max) max = s;
        System.out.println(max);

        }
    }



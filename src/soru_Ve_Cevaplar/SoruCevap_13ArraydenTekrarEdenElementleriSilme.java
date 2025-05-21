package soru_Ve_Cevaplar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoruCevap_13ArraydenTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        /*  Verilen Integer bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
        tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.*/

        Integer[] arr = {3, 5, 6, 8, 2, 3, 5, 1, 4, 8, 6, 2, 3, 4, 8, 1, -1, -1, -1};

        arr = getTekrarsizArray(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static Integer[] getTekrarsizArray(Integer[] arr) {

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }

        }
        arr = new Integer[tekrarsizList.size()]; // [0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        return arr;
    }

}
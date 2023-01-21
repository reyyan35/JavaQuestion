package _04_reyyanLetCodeSolutions;

import java.io.Console;
import java.util.Arrays;

public class _11_plusOne {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {9, 9};
        System.out.println(Arrays.toString(plusOne(a)));
        System.out.println(Arrays.toString(plusOne(b)));
    }

    public static int[] plusOne(int[] dizi) {
        int b = 0;
        int sonuc;
        int c = dizi.length - 1;
        for (int i = 0; i < dizi.length; i++) {
            b = b + ((int) (dizi[i] * Math.pow(10, c)));
            c--;
        }

        sonuc = b + 1;
        String son = String.valueOf(sonuc);
        String[] sonDizi = son.split("");

        int[] newDizi = new int[sonDizi.length];

        for (int i = 0; i < newDizi.length; i++) {
            newDizi[i] = Integer.parseInt(sonDizi[i]);
        }
        return newDizi;

    }
}

package _01_Array_Questions;

import java.util.Arrays;

public class _07_findingDuplicates {
    public static void main(String[] args) {


        int[] a={1, 3123, 5, -3, 13, 101, 50, -131, 6, 191, 311, -500, 6, 19, -3, -5, 101 };

        Arrays.sort(a);

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i+1])
                System.out.println(a[i]);

        }


    }
}

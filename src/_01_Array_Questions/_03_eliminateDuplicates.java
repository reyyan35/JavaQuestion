package _01_Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _03_eliminateDuplicates {
    public static void main(String[] args) {

        //Eliminate duplicate values in an array
        int[] x = {1, 1, 3, 8, 3, 5, 6, 5, 1, 8, 7};

        Set<Integer> set = new HashSet<>();

        for (int i : x) {
            set.add(i);
        }
        System.out.println("<Solution 1.--> =" + set);

        // or

        int[] y = {1, 1, 3, 8, 3, 5, 6, 5, 8, 7};
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < y.length; i++) {
            list.add(y[i]);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) list.remove(list.get(i));
        }
        System.out.println("<Solution 2.--> =" + list);
    }
}


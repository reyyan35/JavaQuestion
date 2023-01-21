package _01_Array_Questions;

import java.util.Arrays;

public class _06_containsSameElements {
    public static void main(String[] args) {
        // Check if two arrays contains same elements count.

        int[] a1 = {1, 2, 3, 2, 1};
        int[] a2 = {1, 2, 3,};
        int[] a3 = {1, 2, 3, 4};
        int[] a4 = {1, 3, 2, 4};
        System.out.println("Are Array <a1> and <a2> same size? = *** " + containsSameElement(a1, a2) + " ***");
        System.out.println("Are Array <a3> and <a4> same size? = *** " + containsSameElement(a3, a4) + " ***");

    }

    public static boolean containsSameElement(int[] x, int[] y) {
        Arrays.sort(x);
        Arrays.sort(y);
        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] == y[i]) return true;
            }
        }
        return false;
    }
}

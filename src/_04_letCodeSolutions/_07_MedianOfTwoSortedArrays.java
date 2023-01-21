package _04_letCodeSolutions;

import javax.swing.tree.TreeNode;
import java.util.*;

public class _07_MedianOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] l1 = {1, 2, 3};
        int[] l2 = {1, 2, 3};

        System.out.println(medianNumber(l1, l2));


    }

    // 1-1-2-2-3
    public static double medianNumber(int[] l1, int[] l2) {
        double median = 0;
        int length=l1.length+ l2.length;
        int[] list = new int[length];


        for (int i = 0; i < list.length; i++) {
            if (i < l1.length)
                list[i] = l1[i];
            else
                list[i] = l2[i - l1.length];
        }
        Arrays.sort(list);

        if (list.length % 2 == 0) {
            median = (list[(list.length / 2)] + (list[(list.length / 2) - 1]));
            median = median / 2;
        } else
            median = list[(list.length / 2)];

        return median;
    }

}

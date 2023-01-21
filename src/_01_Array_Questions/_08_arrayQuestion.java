package _01_Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arrayQuestion {
    public static void main(String[] args) {
        // compare same indexes of 2 different arrays and create another array for mathich values

        int[] x={5, 3, 4, 8, 9, 89};
        int[] y={5, 1, 4, 7, 9, 89};

        System.out.println(Arrays.toString(newArray(x, y)));

    }
    public static Object[] newArray(int[] x, int[] y) {

        ArrayList<Integer> newArrayList=new ArrayList<>();

        for (int i = 0; i < x.length; i++) {
            if (x[i] == y[i]) newArrayList.add(x[i]);
        }

        Object[] newArray= newArrayList.toArray();

        return newArray;
    }
}

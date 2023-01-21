package _01_Array_Questions;

import java.util.Arrays;

public class _11_appendTwoArrays {
    public static void main(String[] args) {
        //Append two arrays. The second array should be appended to the end of first array
        int[] a={1, 3, 5};
        int[] b={7, 9, 11, 13};
        int[] c=new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i]=b[i];

        }

        System.out.println(Arrays.toString(c));



    }
}
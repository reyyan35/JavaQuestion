package _01_Array_Questions;

public class _02_minAndMaxInMDArray {
    public static void main(String[] args) {

        //Find the min and max values in a multidimensional (2D) array

        int[][] x = {{5, 8, 9}, {18, 5, 86}, {56, 3, 200}};

        int min = x[0][0];

        int max = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (min > x[i][j]) min = x[i][j];
                if (max < x[i][j]) max = x[i][j];
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}

package _01_Array_Questions;

public class _05_maxDifference {
    public static void main(String[] args) {

        // Find the greatest difference between values in an int array

        int[] array = {8, 1, 5, 6, 3, 25};

        System.out.println("Result = " + maxDifference(array));
    }

    public static int maxDifference(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i] - array[i + 1]) > max) {
                max = Math.abs(array[i] - array[i + 1]);
            }
        }
        return max;
    }
}

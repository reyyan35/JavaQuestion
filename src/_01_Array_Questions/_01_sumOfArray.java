package _01_Array_Questions;

public class _01_sumOfArray {
    public static void main(String[] args) {
        // Create a method which accepts Array and returns sum of all the elements in the array

        int[] array = {34,3, 77, 12, 51};

        System.out.println("The Result of Array Method= " + arrayTotal(array));

    }
    public static int arrayTotal(int[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }
}

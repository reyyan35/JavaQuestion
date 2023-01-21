package _02_Math_Questions;

public class _06_numbersdividedBy3_5 {
    public static void main(String[] args) {

        // Find all numbers which can be divided by 3 and 5

        int[] a={1, 3123, 5, -3, 13, 101, 50, -120, 6, 191, 311, -500, 6, 19, -3, -5, 45 };

        for (int i = 0; i < a.length; i++) {
            if (a[i]%3 == 0 && a[i]%5 == 0)
                System.out.println(a[i]);

        }
    }
}

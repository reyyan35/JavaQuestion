package _02_Math_Questions;

public class _03_fibonacciSeries {
    public static void main(String[] args) {
        // write a fibonnaci series of 8

        int x = 0;
        int y = 1;
        int sum = 0;


        for (int i = 1; i < 9; i++) {
            sum = x + y;
            System.out.println(sum);
            x = y;
            y = sum;
        }

    }
}
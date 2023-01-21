package _02_Math_Questions;

public class _09_reverseNumberWithMathOperators {
    public static void main(String[] args) {
        // Reverse a given number with math operators
        int number = 56898;
        int reverse = 0;
        int remainder = 0;

        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        } while (number > 0);
        System.out.println(reverse);
    }
}
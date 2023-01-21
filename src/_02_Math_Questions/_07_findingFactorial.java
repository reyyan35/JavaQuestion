package _02_Math_Questions;

public class _07_findingFactorial {
    public static void main(String[] args) {
        //Find the factorial of a number
        int number = 10;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }
}
package _02_Math_Questions;

public class _08_sumOfDigits {
    public static void main(String[] args) {

        //Find the sum of digits of a given number

        int number=1346;
        int sum=0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);

    }
}

package _02_Math_Questions;

public class _17_sumOddAndEvenNumbers {
    public static void main(String[] args) {
        //  Please calculate th sum of odd numbers and even number separately between 0-100.
        int num = 100;
        int counter = 0;
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;

        while (counter <= num) {
            if
            (counter % 2 == 0)
                sumOfEvenNumbers = sumOfEvenNumbers + counter;
            counter = counter + 2;
        }
        System.out.println("çiftler = " + sumOfEvenNumbers);

        num = 100;
        counter = 1;
        sumOfOddNumbers = 0;
        sumOfEvenNumbers = 0;
        while (counter <= num) {
            if
            (counter % 2 == 1)
                sumOfOddNumbers = sumOfOddNumbers + counter;
            counter = counter + 2;
        }
        System.out.println("tekler = " + sumOfOddNumbers);

    }
}
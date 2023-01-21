package _02_Math_Questions;

public class _13_palindromeNumber{
        public static void main(String[] args) {
            // Write a Java Program to find whether a number is palindrome or not.

            int number = 1896981;
            int reverse = 0;
            int temp = number;

            do {
                reverse = (reverse * 10) + (temp % 10);
                temp = temp / 10;

            } while (temp > 0);

            if (number == reverse) System.out.println(true);
            else System.out.println(false);
            System.out.println("reverse = " + reverse);



        }
}


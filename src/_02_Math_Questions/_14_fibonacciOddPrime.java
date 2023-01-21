package _02_Math_Questions;

import java.util.Scanner;

public class _14_fibonacciOddPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int number = sc.nextInt();
        if (isFibonacci(number) && isOdd(number) && isPrime(number))
            System.out.println("This number is fibonacci, odd and prime");
        else System.out.println("This number is either not fibonacci, odd or prime");
    }

    public static boolean isFibonacci(int number) {
        int x = 0;
        int y = 1;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum = x + y;
            x = y;
            y = sum;
            if (sum == number) return true;
        }
        return false;
    }

    public static boolean isOdd(int number) {

        if (number % 2 == 1) return true;
        else return false;
    }

    public static boolean isPrime(int number) {

        for (int i = 1; i < number / 2; i++) {
            if (number % i != 0) return true;

        }
        return false;
    }

}

package _02_Math_Questions;

import java.util.Scanner;

public class _04_primeNumber {
    public static void main(String[] args) {

        // print if a given value is prime or not
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter a Number = ");
        int num = scn.nextInt();

        boolean flag = false;

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("This is not a prime number");
        else System.out.println("This is a prime number");

    }
}


package _02_Math_Questions;

import java.util.Scanner;

public class _16_divideTwoDifferentNumber {
    public static void main(String[] args) {
        // 1- A number
        //if number divide by 9 then left 0 and same number divide by 5 and left 0 -> "Able to divide by 9 and 5"
        //if number divide by 4 then left 0 and same number divide by 15 and left 0 -> "Able to divide by 4 and 15"

        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number, please =");
        int num1 = read.nextInt();

        if ((num1 % 9 != 0 && num1 % 5 != 0) || (num1 % 4 != 0 && num1 % 15 != 0)) {
            System.out.println("Please enter valid number!");
        } else {

            if (num1 % 9 == 0 && num1 % 5 == 0) {
                System.out.println("Able to divide by 9 and 5");
            }
            if (num1 % 4 == 0 && num1 % 15 == 0) {
                System.out.println("Able to divide by 4 and 15 ");
            }

        }
    }
}


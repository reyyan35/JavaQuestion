package _02_Math_Questions;

import java.util.Scanner;

public class _15_findingUnitsDigits {
    public static void main(String[] args) {
        // 1- Is the number's units digit and tens digit odd and equal number?

        Scanner read = new Scanner(System.in);
        System.out.print("Please enter a number = ");
        int num = read.nextInt();
        int unitsDigit = num % 10;
        int tensDigit = (num / 10) % 10;

        System.out.println("Is the number's units digit and tens digit odd and equal number?");
        if (unitsDigit % 2 == 1 && unitsDigit == tensDigit) {
            System.out.println("Yes, it is.");
        } else {
            System.out.println("No, it's not.");
        }

    }
}

package _02_Math_Questions;

public class _12_armstrongNumber {
    public static void main(String[] args) {
        // Write a Java Program to check Armstrong number.

        int number=534494836;
        int temp=number;
        int pow=Integer.toString(number).length();
        int total=0;

        while (temp !=0) {
            total += (int) Math.pow((temp % 10), pow);
            temp = temp / 10;
        }

        if (number == total) System.out.println(true);
        else System.out.println(false);
    }
}
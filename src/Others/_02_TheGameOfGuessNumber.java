package Others;

import java.util.Scanner;

public class _02_TheGameOfGuessNumber {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("******THE NUMBERS GAME*****");
        System.out.print("Please enter a number between 0-100 ....=");
        int num = read.nextInt();
        int max = 100, min = 0;

       int secret = (int) (Math.random() * 101) + min;
       // System.out.println("Mysterious number is =" + secret+" (Do not tell anyone)");

        while (secret != num) {
            if (num < 0 || num > 100) {
                System.out.print("Please enter a number which is between 0-100");
                secret = read.nextInt();
            } else if (num > secret) {
                System.out.print("It is bigger than lucky number...=");
                num = read.nextInt();
            } else {
                System.out.print("It is less than lucky number...=");
                num = read.nextInt();
            }
        }
        System.out.println("Bingooooooo.....");
    }
}

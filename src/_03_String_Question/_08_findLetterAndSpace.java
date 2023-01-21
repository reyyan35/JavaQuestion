package _03_String_Question;

import java.util.Scanner;

public class _08_findLetterAndSpace {
    public static void main(String[] args) {
        // Find the space or a capital "A" in the sentence.

        Scanner read = new Scanner(System.in);
        System.out.print("Enter a sentence =");
        String word = read.nextLine();

        System.out.println("Is there capital \"A\" or space in the sentence?");
        if (word.contains(" ") | word.contains("A")) {
            System.out.println("Yes, there is.");
        } else {
            System.out.println("No, there isn't.");
        }
    }
}

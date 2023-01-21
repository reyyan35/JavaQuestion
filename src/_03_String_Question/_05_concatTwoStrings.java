package _03_String_Question;

import java.util.Scanner;

public class _05_concatTwoStrings {
    public static void main(String[] args) {
        // Connection two different words.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first word =");
        String s1 = sc.nextLine();
        System.out.println("Please enter second word =");
        String s2 = sc.nextLine();
        String concat = "";
        if (s1.charAt(s1.length() - 1) == s2.charAt(0))
            concat = s1.concat(s2.substring(1));
        else concat = s1.concat(s2);

        System.out.println("Result = " + concat);
    }
}

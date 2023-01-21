package _03_String_Question;

public class _04_countOfLettersinAString {
    public static void main(String[] args) {
        //Count the number of letters in a string and return true if it is even or false if it is odd
        String s="lksl+4klmi %ls* 5tlK";

        s=s.replaceAll("[^a-zA-Z]", "");
        if (s.length()%2 == 0) System.out.println(true);
        else System.out.println(false);
    }
}
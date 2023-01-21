package _03_String_Question;

public class _01_reverseString {
    public static void main(String[] args) {
        //Reverse a string without using predefined reverse methods

        String s="Hello World";
        String r="";

        for (int i = s.length()-1; i >= 0; i--) {
            r=r + s.charAt(i);
        }

        System.out.println(r);
    }
}

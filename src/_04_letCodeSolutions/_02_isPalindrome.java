package _04_letCodeSolutions;

public class _02_isPalindrome {
    public static void main(String[] args) {

        int num = 1;
        System.out.println("Result = " + isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        boolean result = true;


        String numS = String.valueOf(num);
        int i = 0;
        int j = numS.length() - 1;

        while (i < j) {
            if (numS.charAt(i++) != numS.charAt(j--)) {
                result = false;
                break;
            }
        }

        return result;

    }
}

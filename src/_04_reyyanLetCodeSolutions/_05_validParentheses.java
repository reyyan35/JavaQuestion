package _04_reyyanLetCodeSolutions;

public class _05_validParentheses {
    public static void main(String[] args) {
        String s1="()";
        String s2="(]";
        String s3="(";
        System.out.println("result= "+isValid(s1));
        System.out.println("result= "+isValid(s2));
        System.out.println("result= "+isValid(s3));



    }
    public static boolean isValid(String s) {
        boolean result=false;
        if (s.length()<=1){ result=false;
            System.out.println("bir parantez var");}
        else
            if (s.charAt(0)=='(' && s.charAt(1)==')')result=true;
            if (s.charAt(0)=='{' && s.charAt(1)=='}')result=true;
            if (s.charAt(0)=='[' && s.charAt(1)==']')result=true;

        return result;


    }
}

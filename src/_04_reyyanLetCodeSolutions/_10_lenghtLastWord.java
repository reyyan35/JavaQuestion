package _04_reyyanLetCodeSolutions;

public class _10_lenghtLastWord {
    public static void main(String[] args) {
        String s=" reyyan nur yılmaz ";
        String s2="";

      int lenght=0;
      int empty=0;
      String[] str1=s.split(" ");

      lenght=str1[str1.length-1].length();


        System.out.println("lenght = " + lenght);


    }
}

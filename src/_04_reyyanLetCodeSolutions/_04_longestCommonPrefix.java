package _04_reyyanLetCodeSolutions;

public class _04_longestCommonPrefix {
    public static void main(String[] args) {
        String[]strs1 = {"flower","flow","flight"};
        String[]strs2 = {"dog","racecar","car"};
        String[]strs3 = {"acı","acıkmak","acık"};
       System.out.println(longestCommonPrefix(strs1));
        System.out.println("*-*-*-*-*-*-*-*-");
        System.out.println(longestCommonPrefix(strs2));
        System.out.println("*-*-*-*-*-*-*-*-");
        System.out.println(longestCommonPrefix(strs3));


    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "there is no common prefix";
            }
        return prefix;}
}

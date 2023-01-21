package _03_String_Question;

import java.util.Locale;

public class _03_countOfB {
    public static void main(String[] args) {
        // Count how many b letter in a given String
        String s = "hajsla hshBvs bAksbJj sbJSBnlBgbfb";
        s = s.toLowerCase();
        int countB = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b')
                countB++;
        }

        System.out.println(countB);
    }
}

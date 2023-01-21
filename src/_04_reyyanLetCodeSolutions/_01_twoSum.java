package _04_reyyanLetCodeSolutions;

import java.util.Arrays;

public class _01_twoSum {
    public static void main(String[] args) {
        int[] num = {5, 11, 2, 7};
        int target = 9;
        System.out.println("Resulttt = " + Arrays.toString(twoSum(num, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] sonuc = new int[2];

        int toplam = 0;
        for (int i = 0; i < nums.length; i++) {
            toplam = nums[i] + nums[i + 1];
            if (toplam == target) {
                System.out.println("result = " + i + " ve " + (i + 1) + "=" + target);
                sonuc[0] = i;
                sonuc[1] = i + 1;
                break;
            }
        }
        return sonuc;

    }
}
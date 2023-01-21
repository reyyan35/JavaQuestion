package _04_reyyanLetCodeSolutions;

import java.util.Arrays;

public class _07_romoveDuplicates {
    public static void main(String[] args) {
        int[] nums1={0,0,1,1,1,2,2,3,3,4};
        Object[] nums2=new Object[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            nums2[i]=nums1[i];
            Arrays.sort(nums2);}
        int sameNumber=0;
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i]!=nums2[sameNumber]){
                i++;
            }
        }
    }
}

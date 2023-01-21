package _04_reyyanLetCodeSolutions;

import java.util.ArrayList;
import java.util.Collections;

public class _13_missingFirstPossitive {
    public static void main(String[] args) {
        int[] nums={1,3,4,0};
        ArrayList<Integer> positiveNumbers= new ArrayList<>();
        int i=1;
        while (i>0){
            positiveNumbers.add(i);
            i++;}
        System.out.println(positiveNumbers);
       for (int j = 0; j < nums.length; j++) {
            if (nums[j]==positiveNumbers.get(j)){
                positiveNumbers.remove(j);
            }
        }
        Collections.sort(positiveNumbers);

        System.out.println("değer= "+ positiveNumbers.get(0));


    }
}

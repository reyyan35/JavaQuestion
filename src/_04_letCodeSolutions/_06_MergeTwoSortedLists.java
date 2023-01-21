package _04_letCodeSolutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _06_MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(sortedList(list1,list2));



    }
    public static List<Integer> sortedList(List<Integer> list1, List<Integer>  list2){
        List<Integer> merged =new ArrayList<>();

        merged.addAll(list1);
        merged.addAll(list2);
        Collections.sort(merged);

        return merged;
    }
}

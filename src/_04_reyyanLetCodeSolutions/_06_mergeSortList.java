package _04_reyyanLetCodeSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _06_mergeSortList {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        List<Integer> list2=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        System.out.println("mergeTwoList(list1,list2) = " + mergeTwoList(list1,list2));

        
    }
    public static List<Integer> mergeTwoList(List<Integer > list1,List<Integer > list2 ){
       List<Integer> mergeList=new ArrayList<>();
       mergeList.addAll(list1);
       mergeList.addAll(list2);
        Collections.sort(mergeList);
       
       
       return mergeList;
    }
}

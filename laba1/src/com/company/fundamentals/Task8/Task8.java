package com.company.fundamentals.Task8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Task 8");
        List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 21, 33, 44, 98, 99, 100, 444));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(3, 4, 5, 25, 40, 80, 94, 150, 500));
        System.out.println(join(list1, list2));
    }

    private static List<Integer> join(List<Integer> intList1, List<Integer> intList2) {
        List<Integer> resList = new LinkedList<>(intList2);
        for (Integer insert : intList1) {
            boolean ins = true;
            for (int j = 0; j < resList.size(); j++) {
                if (resList.get(j) > insert) {
                    resList.add(j, insert);
                    ins = false;
                    break;
                }
            }
            if(ins)
                resList.add(insert);
        }
        return resList;
    }
}

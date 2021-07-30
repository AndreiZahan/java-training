package code._4_student_effort._5_challengeFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        for (Integer i : list1) {
            list2.add(i);
        }

        Collections.sort(list2);
        System.out.print(list2 + " ");
    }
}

package code._4_student_effort._9_challengeNine;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = List.of(11, 123, 11, 16, 151, 87);

        MySet<Integer> mySet = new Set<>();
        for (Integer i : collection) {
            mySet.add(i);
        }

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));
        }
    }
}

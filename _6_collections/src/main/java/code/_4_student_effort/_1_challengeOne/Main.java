package code._4_student_effort._1_challengeOne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        numbers.add(1);
        numbers.add(83);
        numbers.add(31);
        numbers.add(12);
        numbers.add(68);
        List<Integer> leaders = new ArrayList<>();
        extracted(numbers, leaders);
        for (Integer i : leaders) {
            System.out.println(i);
        }
    }

    private static void extracted(List<Integer> numbers, List<Integer> leaders) {
        for (int i = 0; i < numbers.size(); i++) {
            Integer potentialLeader = numbers.get(i);
            boolean isLeader = true;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (potentialLeader < numbers.get(j)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(potentialLeader);
            }
        }
    }
}

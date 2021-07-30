package code._4_student_effort._4_challengeFour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(6);
        numbers.add(2);
        numbers.add(1);

        System.out.println(rearrangeNumbers(numbers));
    }

    public static List<Integer> rearrangeNumbers(List<Integer> integers) {
        List<Integer> numbers = new ArrayList<>(integers);
        boolean checkpoint = true;
        Integer temp = 0;
        for (int i = 0; i <= numbers.size() - 2; i++) {
            if (checkpoint) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                }
            } else {
                if (numbers.get(i) < numbers.get(i + 1)) {
                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                }
            }
            checkpoint = !checkpoint;
        }
        return numbers;
    }
}

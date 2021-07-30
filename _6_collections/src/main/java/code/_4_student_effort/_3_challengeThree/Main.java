package code._4_student_effort._3_challengeThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        showTriangle(pascalTriangle(8));
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(1));

        return getLists(n, triangle);
    }

    public static List<List<Integer>> getLists(int n, List<List<Integer>> triangle) {
        for (int i = 1; i < n; i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            for (int j = 1; j < i; j++) {
                Integer number1 = triangle.get(i - 1).get(j);
                Integer number2 = triangle.get(i - 1).get(j -1);
                triangle.get(i).add(number1 + number2);
            }
            triangle.get(i).add(1);
        }
        return triangle;
    }

    public static void showTriangle(List<List<Integer>> triangle) {
        for (List<Integer> integers : triangle) {
            System.out.println("add");
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        System.out.println("copy");
    }
}

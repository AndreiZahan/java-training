package code._4_student_effort._3_challengeThree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) {
        // Exercise 1
        List<String> sourceList = new ArrayList<>();
        sourceList.add("minge");  // index 0
        sourceList.add("hartie");  // index 1 - odd
        sourceList.add("aurora");  // index 2
        sourceList.add("elefant");  // index 3 - odd
        sourceList.add("capcaun");  // index 4
        sourceList.add("frigider");  // index 5 - odd

        System.out.println("Exercise one:");
        exerciseOneFunction(sourceList);
        System.out.println("--------------");

        // Exercise 2
        System.out.println("Exercise two:");
        exerciseTwoFunction(sourceList);
        System.out.println("--------------");


        // Exercise 3
        System.out.println("Exercise three:");
        sourceList.replaceAll(String::toUpperCase);
        sourceList.forEach(System.out::println);
        System.out.println("--------------");

        // Exercise 4
        Map<String, String> map = new HashMap<>();
        map.put("Andrei", "Zahan");
        map.put("Dobre", "Gica");
        map.put("Szilagy", "Marius");
        map.put("Voicu", "Florea");

        System.out.println("Exercise four:");
        exerciseFourFunction(map);
        System.out.println("--------------");

        // Exercise 5
        System.out.println("Exercise five:");
        List<String> days = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        new Thread(() -> days.forEach(System.out::println)).start();
        System.out.println("--------------");



    }

    private static void exerciseFourFunction(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        map.forEach((s1, s2) -> stringBuilder.append(String.format("Prenume: %s   Nume: %s / ", s1, s2)));
        System.out.println(stringBuilder);
    }

    private static void exerciseTwoFunction(List<String> sourceList) {
        List<String> evenIndexes = IntStream
                .range(0, sourceList.size())
                .filter(s -> s % 2 == 0)
                .mapToObj(s -> sourceList.get(s))
                .collect(Collectors.toList());
        evenIndexes.forEach(System.out::println);
    }

    private static void exerciseOneFunction(List<String> sourceList) {
        StringBuilder stringBuilder = new StringBuilder();
        sourceList.forEach(s -> stringBuilder.append(s.charAt(0)));
        String finalString = stringBuilder.toString();
        System.out.println(finalString);
    }
}

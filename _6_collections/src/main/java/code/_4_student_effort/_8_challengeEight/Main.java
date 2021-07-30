package code._4_student_effort._8_challengeEight;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            integerArrayList.add(i);
        }

        integerArrayList.remove(9);

        integerArrayList.set(11, 99);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i));
        }
    }
}

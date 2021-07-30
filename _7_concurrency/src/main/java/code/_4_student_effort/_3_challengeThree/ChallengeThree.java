package code._4_student_effort._3_challengeThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChallengeThree {
    public static void main(String[] args) throws InterruptedException {
        Player one = new Player();
        Player two = new Player();

        one.start();
        two.start();

        one.join();
        two.join();

        showWinner(one, two);
    }

    static void showWinner(Player threadOne, Player threadTwo) {
        getWinner(threadOne, threadTwo);
    }

    static void getWinner(Player threadOne, Player threadTwo) {
        if (threadOne.result.equals(threadTwo.result)) {
            System.out.println("1st player: " + threadOne.result);
            System.out.println("2nd player: " + threadTwo.result);
            System.out.println("DRAW");
        } else if ( (threadOne.result.equals("paper") && threadTwo.result.equals("rock"))
                || (threadOne.result.equals("rock") && threadTwo.result.equals("scissors"))
                || (threadOne.result.equals("scissors") && threadTwo.result.equals("paper")) ) {
            System.out.println("1st player: " + threadOne.result);
            System.out.println("2nd player: " + threadTwo.result);
            System.out.println("1st player wins!");
        } else {
            System.out.println("1st player: " + threadOne.result);
            System.out.println("2nd player: " + threadTwo.result);
            System.out.println("2nd player wins!");
        }
    }

    static class Player extends Thread {
        public String result;

        @Override
        public void run() {
            List<String> results = new ArrayList<>();
            results.add("rock");
            results.add("paper");
            results.add("scissors");
            Random random = new Random();
            int randomIndex = random.nextInt(3);
            result = results.get(randomIndex);
        }
    }
}

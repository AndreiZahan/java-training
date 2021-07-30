package code._4_student_effort._1_challengeOne;

public class ThreadRace {
    public static void main(String[] args) {
        ThreadRace threadRace = new ThreadRace();
        threadRace.threadRace();

    }

    public Thread createRabbitThread (int nr) {
        return new RabbitThread(nr);
    }

    public Thread createRabbitRunnable (int nr) {
        RabbitRunnable rabbitRunnable = new RabbitRunnable(nr);
        return new Thread(rabbitRunnable);
    }

    public Thread getPosition (int position) {
        if (position % 2 == 0) {
            return createRabbitThread(position);
        } else return createRabbitRunnable(position);
    }

    public void startRunning (Thread thread) {
        thread.start();
    }

    public void threadRace() {
        for (int i = 0; i < 20; i++) {
            Thread thread = getPosition(i);
            startRunning(thread);
        }
    }
}

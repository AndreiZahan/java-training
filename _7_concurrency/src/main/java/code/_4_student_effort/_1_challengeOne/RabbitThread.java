package code._4_student_effort._1_challengeOne;

public class RabbitThread extends Thread {
    private int nr;

    public RabbitThread(int nr) {
        this.nr = nr;
    }

    public RabbitThread(Runnable target, int nr) {
        super(target);
        this.nr = nr;
    }

    public RabbitThread(ThreadGroup group, Runnable target, int nr) {
        super(group, target);
        this.nr = nr;
    }

    public RabbitThread(String name, int nr) {
        super(name);
        this.nr = nr;
    }

    public RabbitThread(ThreadGroup group, String name, int nr) {
        super(group, name);
        this.nr = nr;
    }

    public RabbitThread(Runnable target, String name, int nr) {
        super(target, name);
        this.nr = nr;
    }

    public RabbitThread(ThreadGroup group, Runnable target, String name, int nr) {
        super(group, target, name);
        this.nr = nr;
    }

    public RabbitThread(ThreadGroup group, Runnable target, String name, long stackSize, int nr) {
        super(group, target, name, stackSize);
        this.nr = nr;
    }

    public RabbitThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals, int nr) {
        super(group, target, name, stackSize, inheritThreadLocals);
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.printf("Rabbit #%s is running! \n", nr);
    }
}

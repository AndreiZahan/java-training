package code._4_student_effort._2_challengeTwo;

public class TransactionThread extends Thread {
    private int amount;
    private BankAccount from;
    private BankAccount to;
    private String name;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

}

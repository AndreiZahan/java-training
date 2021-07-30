package code._4_student_effort._2_challengeTwo;

public class Transaction {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account1 = new BankAccount("Robert T.", 25000);
        BankAccount account2 = new BankAccount("Rosa F.", 3200);

        TransactionThread thread1 = new TransactionThread("1st Thread", account2, account1, 3000);

        thread1.start();
        thread1.join();

        System.out.println(account1.getDebit());
        System.out.println(account2.getDebit());

    }
}

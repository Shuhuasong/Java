package Multi_Thread.BankSavingSystem;

public class Save {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        AddTask addTask = new AddTask(bankAccount);
        Thread John = new Thread(addTask, "John");
        Thread Amy = new Thread(addTask, "Amy");
        John.start();
        Amy.start();

    }
}

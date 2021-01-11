package Multi_Thread.BankSavingSystem;

public class AddTask implements Runnable {

    private BankAccount bankAccount;
    public AddTask(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    @Override
    public void run(){
        for(int i=0; i<3; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bankAccount.add(100);
            System.out.println(Thread.currentThread().getName() + " " + i + "th time saving 100" + " the total is : " + bankAccount.getSum());
        }
    }
}

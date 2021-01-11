package Multi_Thread.BankSavingSystem;

public class BankAccount {

    private int sum;
    public void add(int num){
        synchronized (this) {
            sum += num;
        }
    }

    public int getSum(){
        return sum;
    }
}

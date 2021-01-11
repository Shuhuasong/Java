package Multi_Thread.Synchronized;

public class DeadLock_Ex {
    public static void main(String[] args) {
        Object chopsticks = new Object();
        Object knifeAndFork = new Object();
        Thread Chinese = new Thread(new DeadLockRun(true, chopsticks, knifeAndFork), "Chinese");
        Thread American = new Thread(new DeadLockRun(false, chopsticks, knifeAndFork), "American");
        Chinese.start();
        American.start();
    }
}

class DeadLockRun implements Runnable{
    private boolean flag;
    private Object chopsticks;
    private Object knifeAndFork;

    public DeadLockRun(boolean flag, Object chopsticks, Object knifeAndFork){
        this.flag = flag;
        this.chopsticks = chopsticks;
        this.knifeAndFork = knifeAndFork;
    }

    @Override
    public void run(){
        if(flag){
            synchronized (chopsticks){
                System.out.println(Thread.currentThread().getName() + " get chopsticks.");
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (knifeAndFork){
                    System.out.println(Thread.currentThread().getName() + " get knifeAndFork");
                }
            }
        }else{

            synchronized (chopsticks){
                System.out.println(Thread.currentThread().getName() + " get chopsticks");
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (knifeAndFork){
                    System.out.println(Thread.currentThread().getName() + " get knifeAndFork.");
                }
            }
        }
    }
}

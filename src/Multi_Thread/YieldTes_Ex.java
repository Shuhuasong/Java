package Multi_Thread;

public class YieldTes_Ex {
    public static void main(String[] args) {
         Runnable target;
         Thread t1 = new Thread(new YieldRun(), "threadA");
         Thread t2 = new Thread(new YieldRun(), "threadB");
         t1.start();
         t2.start();
    }

    static class YieldRun implements Runnable{
        @Override
        public void run(){
            for(int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName() + "----" + i);
                if(i==3 || i==5){
                    System.out.println(Thread.currentThread().getName() + "Yeild");
                    Thread.yield();
                }
            }
        }
    }
}

package Multi_Thread;

public class SleepTest_Ex {

    public static void main(String[] args) throws InterruptedException {
      Thread thread = new Thread(new TaskForSleep(), "thread2");
      thread.start();
      for(int i=0; i<10; i++){
          Thread.sleep(500);
          System.out.println("The main thread is printingn "+ i);
      }
    }

    static class TaskForSleep implements Runnable{
        @Override
        public void run() {
            for(int i=0; i<10; i++){
                try{
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName() + "is printing " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

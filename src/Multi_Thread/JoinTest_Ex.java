package Multi_Thread;

public class JoinTest_Ex {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new EmergencyThread(), "thread1");
        t1.start();
        for(int i=0; i<6; i++){
            System.out.println(Thread.currentThread().getName() + "printing: " + i);
            if(i==3){
                t1.join();
            }
            Thread.sleep(500);
        }
    }

    static class EmergencyThread implements Runnable{
        @Override
        public void run(){
            for(int i=1; i<6; i++){
                System.out.println(Thread.currentThread().getName() + "printing " + i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



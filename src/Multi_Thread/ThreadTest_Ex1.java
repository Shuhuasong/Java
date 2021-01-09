package Multi_Thread;

public class ThreadTest_Ex1 {
    public static void main(String[] args) {
        Thread thread = new TextThread();
        thread.start();
        for(int i=0; i<20000; i++){
            System.out.println("main-thread output: " + i);
        }
    }

    static class TextThread extends Thread{
        @Override
        public void run(){
            for(int i=0; i<20000; i++){
                System.out.println("test-thread output: " + i);
            }
        }
    }
}

package Multi_Thread.Synchronized;

public class SyncFunTicket_Ex {

    public static void main(String[] args) {
        TicketWindowOfSyncFun ticketWindowOfSyncFun = new TicketWindowOfSyncFun();
        new Thread(ticketWindowOfSyncFun, "window1").start();
        new Thread(ticketWindowOfSyncFun, "window2").start();
        new Thread(ticketWindowOfSyncFun, "window3").start();
        new Thread(ticketWindowOfSyncFun, "window4").start();
    }
}

class TicketWindowOfSyncFun implements Runnable{
    private int ticket = 10;
    private Object lock = new Object();
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!getTicket()) {
                break;
            }
        }
    }

    private synchronized boolean getTicket(){
        //same
        //synchronized (this){....}
            if(ticket>0){
                System.out.println(Thread.currentThread().getName() + "selling ticket is " + ticket--);
                return true;
            }else{
                return false;
            }
     }
}

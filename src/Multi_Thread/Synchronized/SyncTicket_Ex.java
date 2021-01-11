package Multi_Thread.Synchronized;

 class SyncTicket_Ex0 {

    public static void main(String[] args) {
       TicketWindow ticketWindow = new TicketWindow();
       new Thread(ticketWindow, "window1").start();
       new Thread(ticketWindow, "window2").start();
       new Thread(ticketWindow, "window3").start();
       new Thread(ticketWindow, "window4").start();
    }
}

class TicketWindow implements Runnable{
    private int ticket = 10;
    private Object lock = new Object();
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!getTicket()){
                break;
            }
        }
    }

    private boolean getTicket(){
        synchronized (lock){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName() + "selling ticket is " + ticket--);
                return true;
            }else{
                return false;
            }
        }
    }
}

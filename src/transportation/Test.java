package transportation;

public class Test {

    public static void main(String[] args) {
        ZTransportation zTrans = new ZTransportation("100001", "Audi", "Mike");
        GPS gps = new Phone();

        SendTask sendtask = new SendTask("22233", 12345.56);

        sendtask.sendBefore();
        sendtask.send(zTrans, gps);
        sendtask.sendAfter(zTrans);
    }
}

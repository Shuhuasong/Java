package transportation;



public class SendTask {
    String number;
    double goodsWeight;

    public SendTask(String number, double goodsWeight){
        this.number = number;
        this.goodsWeight = goodsWeight;
    }

    public void sendBefore(){
        System.out.println("Load the car, Please wait");
    }

    public void send(Transportation trans, GPS gps){
        System.out.println(trans.getAdmin());
        System.out.println(gps.showCoordinate());
    }
    public void sendAfter(Careable careable){
        careable.upKeep();
    }
}

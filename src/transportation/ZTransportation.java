package transportation;

public class ZTransportation extends Transportation implements Careable {

    public ZTransportation(){}

    public ZTransportation(String number, String model, String admin){
        super(number, model, admin);
    }

    public void transport(){
        System.out.println(this.getModel() + "is  on the road");
    }

    @Override
    public void upKeep(){
        System.out.println(  this.getModel() + ": " + this.getModel() + ":"  + this.getAdmin()  + ":   is in the caring");
    }
}

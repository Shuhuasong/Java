package interface_Ex1;

public class Keyboard implements USB {

    @Override
    public void turnOn(){
        System.out.println("Keyboard turn On");
    }

    @Override
    public void turnOff(){
        System.out.println("Keyboard turn off");
    }
}

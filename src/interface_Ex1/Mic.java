package interface_Ex1;

public class Mic implements USB{

    @Override
    public void turnOn(){
        System.out.println("Mic turn on");
    }

    @Override
    public void turnOff(){
        System.out.println("Mic turn off");
    }
}

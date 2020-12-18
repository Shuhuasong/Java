package interface_Ex1;

public class Mouse implements USB {

    @Override
    public void turnOn(){
        System.out.println("Mouse turn On");
    }

    @Override
    public void turnOff(){
        System.out.println("Mouse turn Off");
    }
}

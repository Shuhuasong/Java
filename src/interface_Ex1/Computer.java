package interface_Ex1;

public class Computer implements USB{

    public USB[] usbs;
    public Computer(){
        usbs = new USB[4];
    }

    public void add(USB usb){
        for(int i=0; i<usbs.length; i++){
            if(usbs[i]==null){
                usbs[i] = usb;
                return;
            }
        }
    }

    @Override
    public void turnOn(){
        for(USB usb : usbs){
            if(usb != null){
                usb.turnOn();
            }
        }
    }

    @Override
    public void turnOff(){
        for(USB usb : usbs){
            if(usb != null){
                usb.turnOff();
            }
        }
    }

}

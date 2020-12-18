package interface_Ex1;

public class Test {

    public static void main(String[] args){
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();
        USB mic = new Mic();

        Computer computer = new Computer();

        computer.add(mouse);
        computer.add(keyboard);
        computer.add(mic);
        computer.turnOn();
        computer.turnOff();
    }
}

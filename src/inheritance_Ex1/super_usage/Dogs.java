package inheritance_Ex1.super_usage;

public class  Dogs extends Animal{
    public Dogs(String name){
        super(name);
    }

    public static void main(String[] args) {
        Dogs dog = new Dogs("Hello World");
    }
}
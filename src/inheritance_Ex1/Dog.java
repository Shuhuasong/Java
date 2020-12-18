package inheritance_Ex1;

public class Dog extends Animal{
    String name = "Dog";
    public Dog(String name1){
        super(name1); //super is used to access parent's  constructor
        System.out.println(name);//parent's name
    }

    //overwrite parent's method
    public void shout(){
        System.out.println("child is shouting");
        super.shout();
    }

    public void printName(String name){

        System.out.println("name = " + name);
        System.out.println("Parent's Name = " + super.name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("military dog");
       // dog.name = "Airspace";
        dog.shout();
        dog.printName(dog.name);

    }
}

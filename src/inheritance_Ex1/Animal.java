package inheritance_Ex1;

public class Animal {
    String name = "Animal";

   public Animal(String name){
       System.out.println("I am a " + name);
   }

    public void shout(){
        System.out.println("Animal is shouting");
    }
}

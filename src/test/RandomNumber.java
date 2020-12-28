package test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        Scanner scan = new Scanner(System.in);
        int myNum;
        do{
            System.out.println("please input a number");
            myNum = scan.nextInt();
            if(myNum > randomNum){
                System.out.println("the number is too big");
            }else if(myNum < randomNum){
                System.out.println("the number is too small");
            }else{
                System.out.println("Bingo");
            }
        }while(myNum != randomNum);
    }
}

/*

IntelliJ IDEA 中有什么让你相见恨晚的技巧？*/
 
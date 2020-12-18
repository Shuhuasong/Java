package exception_Ex;

public class Exception_Ex1 {

    public static void main(String[] args){
        System.out.println(divide(4, 0));//the dividen is zero
        System.out.println("Happy Ending");
    }

    public static int divide(int x, int y){
        int result = x/y;
        return result;
    }
}

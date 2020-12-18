package exception_Ex;

public class CatchException_Ex2 {

    public static void main(String[] args){
        try{
            int c = divide(4, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is finally");
        }
        System.out.println("Happy Ending");
    }

    public static int divide(int x, int y){
        int result = x/y;
        return result;
    }
}

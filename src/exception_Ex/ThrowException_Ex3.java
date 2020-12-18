package exception_Ex;

public class ThrowException_Ex3 {
    public static void main(String[] args) throws Exception {
        //System.out.println(divide(4, 0));
     /*   try{
            int c = divide(4, 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is finally");
        }*/
        System.out.println("Happy Ending");
    }

    public static int divide(int x, int y) throws Exception{
        int result = x/y;
        return result;
    }
}

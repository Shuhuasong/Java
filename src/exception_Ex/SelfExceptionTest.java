package exception_Ex;

public class SelfExceptionTest {
    public static void main(String[] args) {
        try{
            divide(10, 0);
        }catch(SelfDefineException_Ex4 e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Happy Ending");
    }

    public static int divide(int a, int b) throws SelfDefineException_Ex4{
        Integer c = null;
        try{
            c = a/b;
        }catch(Exception e){
            throw new SelfDefineException_Ex4("new divided exception");//throw a self define exception
        }finally{
            System.out.println("exception happened");
        }
        return c;
    }
}

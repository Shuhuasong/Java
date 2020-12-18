package inner;

public class Outer {
    private int num = 4;
    public void test(){
        Inner inner = new Inner();
        inner.show();
    }

    class Inner{
        void show(){
            System.out.println("num = " + num);
        }
    }
}

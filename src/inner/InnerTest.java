package inner;

public class InnerTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        //Need the instance of Outer class to create instance of Inner Class
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}

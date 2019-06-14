package Questions8;

public class TestSomeClass {


    public static void main(String[] args) {
        int y = 20;
        SomeClass myObject = new SomeClass(5);
        System.out.println(myObject.getX());
        test(y, myObject);
        System.out.println(y);
        System.out.println(myObject.getX());
    }

    static void test(int z, SomeClass classIn){
        z = 50;
        classIn.setX(100);
    }
}

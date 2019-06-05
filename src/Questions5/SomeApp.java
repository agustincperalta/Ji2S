package Questions5;

public class SomeApp {
    public static void main(String[] args) {
        method1();
        System.out.println("England");
        method2();
        System.out.println("Ireland");
    }

    static void method1(){
        System.out.println("Wales");
    }

    static void method2(){
        System.out.println("Scotland");
        method1();
    }
}

// Output:
// Wales
// England
// Scotland
// Wales
// Ireland
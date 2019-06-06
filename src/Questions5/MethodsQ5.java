package Questions5;
// What would be displayed on the screen as a result
// of running the following program
// OUTPUT --> 11 7
public class MethodsQ5 {
    public static void main(String[] args) {
        int x = 2;
        int y = 7;
        System.out.println(myMethod(x, y));
        System.out.println(y);
    }

    static int myMethod(int a, int x){
        int y = 20;
        return y - a - x;
    }
}

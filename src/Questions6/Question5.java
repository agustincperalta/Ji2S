package Questions6;

// (a) Describe the varargs feature of java: is another way of expressing
// a multiple parameter recibed by a such method, but also you can send
// not only array values, but individual ones, too
// (b) Re-write the contains method below, from sect 6.8.5 to make use
// of this varargs feature
// (c) Give examples of different ways in which you could call this
//re-written contains method now that you have used varags
public class Question5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        // Example 1
        boolean resultado1 = contains(4, array);
        // Example 2
        boolean resultado2 = contains(3, 1, 2, 3, 5, 6, 4);
        System.out.println(resultado1);
        System.out.println(resultado2);
    }

    static boolean contains(int valueIn, int... arrayIn) {
        // enhanced 'for' loop used here
        for (int currentElement : arrayIn) {
            if (currentElement == valueIn) {
                return true; // exit loop early if value found
            }
        }
        return false; // value not present
    }
}

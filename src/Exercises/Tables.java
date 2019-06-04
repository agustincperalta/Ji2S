package Exercises;
/*Using a for loop, write a program that displays a "6 times" multiplication
* table; the output should look like this:
* 1 x 6 = 6
* 2 x 6 = 12
* ...
* */

public class Tables {

    public static void main(String[] args) {

        drawTable(6,12);

    }

    public static void drawTable(int num, int limit){

        for (int i = 1; i<= limit ;i++ ){

            System.out.println(i + " x " + num + " = " + (i*num));
        }
    }
}

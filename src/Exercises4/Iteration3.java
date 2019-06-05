package Exercises4;

public class Iteration3 {

    /*Write a program that makes use of nested for loops to display the following shapes:
    *(a)
    *   ******
    *   ******
    *   ******
    * (b)
    *   ***
    *   ***
    *   *********
    *   *********
    *   ***
    *   ***
    *   Hint: make use of an if... else statement inside your for loops
    * (c)
    *   ****
    *   ***
    *   **
    *   *
    * */

    public static void main(String[] args) {
        drawStars1();
        System.out.println();
        drawStars2();
        System.out.println();
        drawStars3();
    }

    public static void drawStars1(){
        for (int i = 1; i <=3; i++){
            System.out.println();
            for (int j = 1; j <= 6; j++){
                System.out.print("* ");
            }
        }
    }

    public static void drawStars2(){
        for (int i = 1; i <=6; i++){
            System.out.println();
            if (i == 3 || i == 4){
                for (int j = 1; j<= 6; j++){
                    System.out.print("* ");
                }
            }
            for (int j = 1; j<= 3; j++){
                System.out.print("* ");
            }
        }
    }

    public static void drawStars3(){
        for (int i = 1; i<= 4; i++){
            System.out.println();
            for (int j = i; j <= 4; j++){
                System.out.print("* ");

            }
        }
    }
}

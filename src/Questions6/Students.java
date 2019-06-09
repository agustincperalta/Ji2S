package Questions6;

import java.util.Scanner;

/*
* Assume that an array has been declared in main has follows
*   int [] javaStudents
* This array is to be used to store a list of studen exam
* marks. Now, for each of the following methods, write the code
* for the given method and the instruction in main to call
* this method
*
* a) A method, enterExamMarks, that prompts the user to enter
* some exam marks (as integers), stores the marks in an array
* and then returns this array.
* b) A method, increaseMarks, that accepts an array of exam
* marks and increases each mark by 5.
* c) A method, allHavePassed, that accepts an array of exam
* marks and returns true if all marks are greater than or
* equal to 40, and false otherwise.
* */

public class Students {
    public static void main(String[] args) {
        Scanner kbd2 = new Scanner(System.in);
        System.out.println("Cuantas calificaciones ingresaras?");
        int [] javaStudents = enterExamMarks(kbd2.nextInt());
        increaseMarks(javaStudents);
        System.out.println(allHavePassed(javaStudents));

    }

    static int[] enterExamMarks(int num){
        int[] marks = new int[num];
        Scanner kbd = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++){
            // TODO agregar validacion de calificaciones ingresadas
            System.out.println("Calificación: " + (i + 1));
            marks[i] = kbd.nextInt();
        }
        return marks;
    }
    static void increaseMarks(int[] marks){
        for (int i = 0; i < marks.length; i++){
            marks[i] += 5;
        }
    }

    static boolean allHavePassed(int[] marks){
        for (int e: marks) {
            if (e < 40){
                return false;
            }
        }
        return true;
    }


}

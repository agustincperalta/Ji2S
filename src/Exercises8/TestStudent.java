package Exercises8;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

/*
* (b) Write a tester class to test out your Student class; it should create two or
three students (or even better an ArrayList of students), and use the
methods of the Student class to test whether they work according to the
specification.
* */
public class TestStudent {
    public static void main(String[] args) {
        Faker f = new Faker(new Locale("es-MX"));
        ArrayList<Student> curso = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            curso.add(new Student(Integer.toString(f.number().numberBetween(1, 10)), f.name().fullName()));
        }
        for (int i = 0; i < curso.size(); i++) {

            curso.get(i).enterMarks(f.number().numberBetween(1, 10), f.number().numberBetween(1, 10), f.number().numberBetween(1, 10));
        }
        System.out.println("CALIFICACIONES");
        printMarks(curso);
        System.out.println("PROMEDIOS");
        for (int i = 0; i < curso.size(); i++) {
            System.out.print((i + 1) + ".- ");
            System.out.printf("%1.1f", curso.get(i).calculateAverageMark());
            System.out.println();
        }


    }

    public static void printMarks(ArrayList<Student> s) {
        for (int i = 0; i < s.size(); i++) {
            System.out.print((i + 1) + ".- ");
            System.out.print(s.get(i).getMarkForEnglish() + " ");
            System.out.print(s.get(i).getMarkForMaths() + " ");
            System.out.print(s.get(i).getMarkForScience() + " ");
            System.out.println();
        }
    }
}

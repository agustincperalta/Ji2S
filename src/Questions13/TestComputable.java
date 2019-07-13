package Questions13;
// Question 7
// Consider the following program; a lambda expression has been replaced by a comment
/*
* Replace the comment with a lambda expression that causes the compute method to return
* the sum of the two doubles it recibes, and then test out your program with some
* different values in the printResult method
* */

// (c) Change the lambda expression so that it performs other calculations such as
// subtraction or multiplication
public class TestComputable {
    public static void main(String[] args) {
        Computable multiplicacion = (a, b) -> a * b;
        Computable division = (a, b) -> a / b;
        Computable suma = (a, b) -> a + b;
        Computable resta = (a, b) -> a -b;
        printResult(multiplicacion);
        printResult(division);
        printResult(suma);
        printResult(resta);


    }

    public static void printResult(Computable compIn){
        System.out.println(compIn.compute(3, 23));
    }
}

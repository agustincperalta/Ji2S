package Questions5;

/*
* (a) By refering to this program
* (i) Distinguish between the term actual parameters and formal parameters
* --> actual parameters are the values passed to the call of the function also
 * named arguments
* --> formal parameters are the values defined in the method declaration
*
* (ii) Explain what is meant by a method's return type
* --> is the value that returns the function
* (iii) Explain the meaning of the terms polymorphism and method overloading
* --> polymorphism is the way that a method do a certain job depending of
* the actual parameters that are set up in its call
* --> overloading: when you write a function with the same name in the same
* class, you are overloading a method, because you are adding a specific
* behaivor to a such method
*
* (c)
* Explain, giving reasons, the effect of adding either of the following
* lines into the main method
* (i) System.out.println(myMethod(3)); --> Error; there are not such method
* that recibes just one arguments
* (ii) System.out.println(myMethod(3, 5.7, 10)); --> Error; the formal parameters
 * are defined in the methods as int values, so if you pass another data type
 * you are not fulfill the requirement of the method at all.
 * * */


public class MethodsQ3 {
    public static void main(String[] args) {
        System.out.println(myMethod(3, 5));
        System.out.println(myMethod(3,5,10));

    }

    static int myMethod(int firstIn, int secondIn, int thirdIn){
        return firstIn + secondIn + thirdIn;
    }

    static int myMethod(int firstIn, int secondIn){
        return firstIn - secondIn;
    }
}
// (b)
// Output:
// -2
//18
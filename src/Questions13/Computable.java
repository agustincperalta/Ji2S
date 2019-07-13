package Questions13;
/* Question 7
* (a) Write the code for an interface, Computalbe, which has a single
* method, compute, that accepts two doubles and returns a double
* */
@FunctionalInterface
public interface Computable {
    double compute(double a, double b);
}

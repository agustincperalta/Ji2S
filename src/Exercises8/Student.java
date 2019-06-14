package Exercises8;
/*
* (a) Write the code for the Student class discussed in self-test question 2
above. You should note that in order to ensure that a double is returned
from the calculateAverageMark method you should specifically
divide the total of the three marks by 3.0 and not simply by 3 (look back at
Chap. 2 to remind yourself why this is the case).
Another thing to think about is what you choose for the initial values of the
marks. If you chose to give each mark an initial value of zero, this could be
ambiguous; a mark of zero could mean that the mark simply has not been
entered—or it could mean the student actually scored zero in the subject!
Can you think of a better initial value?
You can assume that the fees for the student are set initially to 3000.
*

*/
public class Student {
    private String studentNumber ;
    private String studentName;
    // The marks contains -1 consequently they are not initialized yet
    // If they remain the default zero value, it may be confusing
    // if they are consulted (perhaps the actual mark is zero!)
    private int markForMaths = -1;
    private int markForEnglish = -1;
    private int markForScience = -1;
    private static double fee = 3000;

    public Student(String studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void enterMarks(int markForEnglish, int markForMaths, int markForScience){
        this.markForEnglish = markForEnglish;
        this.markForMaths = markForMaths;
        this.markForScience = markForScience;
    }

    public int getMarkForMaths() {
        return markForMaths;
    }

    public int getMarkForEnglish() {
        return markForEnglish;
    }

    public int getMarkForScience() {
        return markForScience;
    }

    public double calculateAverageMark(){
        return (markForScience + markForEnglish + markForMaths) / 3.0; // Divided by 3.0 not 3
    }

    public static double getFee() {
        return fee;
    }

    public static void setFee(double fee) {
        Student.fee = fee;
    }
}

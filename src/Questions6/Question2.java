package Questions6;

public class Question2 {

    public static void main(String[] args) {

        int[] someArray = {2 ,5, 1, 9, 11};
        // Write a standard for loop that will double the value of
        // every item in someArray
        for(int i = 0; i < someArray.length; i++){
            someArray[i]+= 2;
        }
        // Use an enhanced for loop to display the values inside the
        // array
        for (int e: someArray){
            System.out.print(e + " ");
        }

        System.out.println();
        // Modify the enhanced for loop above so that only numbers
        // greater than 2 are displayed

        for (int e: someArray
             ) {
            if (e > 2 ){
                System.out.print(e + " ");
            }

        }
    }
}

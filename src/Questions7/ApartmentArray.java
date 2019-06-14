package Questions7;

/*
 * (a) Declare an array called rooms, to hold thre oblong objects.
 * Each Oblong object will represent the dimensions of a roo in an apartment
 *
 * (b) The three rooms in the apartment have the following dimensions
 * Add three appropiate Oblong object to the rooms array to represent
 * these 3 rooms
 * 1. 5.2 x 4.7
 * 2. 5.2 x 5.7
 * 3. 8.1 x 5.0
 *
 * (c) Write the line of code that would make use of the rooms array
 * to display the area of room 3 to the screen
 *
 * */
public class ApartmentArray {
    public static void main(String[] args) {

        Oblong[] rooms = new Oblong[3];

        rooms[0] = new Oblong(5.2, 4.7);
        rooms[1] = new Oblong(5.2, 5.7);
        rooms[2] = new Oblong(8.1, 5.0);

        double area3 = rooms[2].calculateArea();
        System.out.println(area3);

    }


}

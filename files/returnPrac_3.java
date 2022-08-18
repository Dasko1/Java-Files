// Return a cubed value; to use this, run cube.java!  This gets called in cube.java also!
package files;

import java.util.Scanner;

public class returnPrac_3 {

    // What do you want: the method cubedValue does actions: the declared variable 'output' takes an integer 'x' and cubes it.
    // Method 1: declare how you want to calculate what you want.
    int cubedValue(int x){
        int output = x * x * x;

        return output;
    }

    // Method 2, the main method: gets the value calculated in the 'output' variable to l.28.
    public static void main(String[] args){

        // Get input integer from class GiveUserNum
        int num = new GiveUserNum().giveUserNum();

        // Create an instance variable, that is, an new object of the returnPrac_3 class and call it 'A'.
        returnPrac_3 A = new returnPrac_3();

        // Now print out what you want calculated!  A is the object and new instance variable of class returnPrac_3,
        // and cubedValue is the method that was defined above in lines 10-14!
        System.out.println("\nThe cube is: " + A.cubedValue(num));
    }
}

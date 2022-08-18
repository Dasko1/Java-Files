// The method that calculates the value of the variable num from the cubedValue method from returnPrac_3.java! Even though this is a new class,
// you can call, that is, use the method ReturnPrac_3 in this class!
package files;

public class cube {

    public static void main(String[] args){

        // Get input integer from class GiveUserNum and then cube that value from returnPrac_3!  You are calling 2 methods!
        int num = new GiveUserNum.giveUserNum();
        returnPrac_3 newCube = new returnPrac_3();
        System.out.println("\nThe cube is: " + newCube.cubedValue(num));
    }
}

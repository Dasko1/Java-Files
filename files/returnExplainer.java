// See returnPrac_3.java for another example.

package files;

public class returnExplainer {

    int x = 5;
    int y = 7;

    int getX(int a, int b){
        int sum = x + y;

        return sum;
    }

    public static void main(String[] args){

        returnExplainer result = new returnExplainer();             // Calls new instance variable or object of class returnExplainer
        System.out.println(result.getX(result.x, result.y));        // 'result' prints the values returned from the getX method.
    }
}

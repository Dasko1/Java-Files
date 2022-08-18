package files;

/*Declare the class rectangle at a high level what a rectangle is in ll. 3-5, namely a shape of length & width,
 and the method in ll. 7-9 or functionality, inserts the rectangles length & width*/

public class Rectangle {
    int length;
    int width;

    // This method inserts, that is, does the action of inserting the length and width to measure the rectangle.
    void insert(int l, int w) {
        length = l;
        width = w;
    }

    // This method actually calculates the area of the rectangle whose features were defined above.
    void calculateArea() {
        System.out.println("The area of the rectangle is: " + length * width);
    }

    // This method actually calculates the circumference of the rectangle whose features were defined above.
    void calculateCircumference(){
        System.out.println("The circumference of the rectangle is: " + 2 * (length + width));
    }
}
    // This instantiates a specific object or instance of the class Rectangle in the main method.
    class TestRectangle1{
        public static void main(String args[]){
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();
            r1.insert(11,5);
            r2.insert(3,15);
            r1.calculateArea();
            r2.calculateArea();
            r1.calculateCircumference();
            r2.calculateCircumference();
    }
}

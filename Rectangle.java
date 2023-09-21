

// implement a class Rectangle that contains constructor to initialize values of length and breath using this keyword, and compute its area using the function CalculateAreafunction and return and display area  in java


public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int CalculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(911,420);
        int area = r1.CalculateArea();
        System.out.println("Area of the rectangle = " + area);
    }
}



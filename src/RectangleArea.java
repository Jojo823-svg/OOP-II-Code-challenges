public class RectangleArea {
    double length = 20.5;
    double width = 11.5;

    void area() {
        double area = length * width;
        System.out.println("Area of rectangle:" + area);
    }


    public static void main(String[] args) {
        new RectangleArea().area();
    }
}


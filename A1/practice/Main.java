package A1.practice;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 10, 130);
        Rectangle rectangle = new Rectangle(5, 5, 30, 50);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
        System.out.println("The x coordinate of the circle is: " + circle.getX());
        System.out.println("The y coordinate of the circle is: " + circle.getY());
        System.out.println("The x coordinate of the rectangle is: " + rectangle.getX());
        System.out.println("The y coordinate of the rectangle is: " + rectangle.getY());
        System.out.println("The length of the rectangle is: " + rectangle.getL());
        System.out.println("The height of the rectangle is: " + rectangle.getH());
        System.out.println("The radius of the circle is: " + circle.getRadius());
        System.out.println(
                "The circle contains the center of the rectangle: " + ShapeTester.compareShapes(rectangle, circle));
        ShapeTester.compareArea(rectangle, circle);
    }

}

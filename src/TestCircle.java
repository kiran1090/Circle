public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("the radius of circle is " + c1.getRadius() + "area is" + c1.getArea());


        Circle c2 = new Circle(2.0);
        {
            System.out.println("the radius of circle is " + c2.getRadius() + "area is" + c2.getArea());
        }

    }
}

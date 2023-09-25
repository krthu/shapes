public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.0, 4.0);
        Triangle t1 = new Triangle(2.0, 4.0);

        System.out.println(r1.getWidth() + " " + r1.getHeight());

        System.out.println(r1.getArea());


        System.out.println(t1.getWidth() + " " + t1.getHeight());
        System.out.println(t1.getArea());

    }
}
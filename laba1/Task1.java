package Task1;

public class Task1 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(40.0, 4.0);
        Rectangle b = new Rectangle(35.9, 3.5);
        System.out.println("ширина первого "+a.width);
        System.out.println("высота первого "+a.height);
        System.out.println("площадь первого "+a.getArea());
        System.out.println("периметр первого "+a.getPerimeter());
        System.out.println("ширина второго "+b.width);
        System.out.println("высота второго "+b.height);
        System.out.println("площадь второго "+b.getArea());
        System.out.println("периметр второго "+b.getPerimeter());
    }
}

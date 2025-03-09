
public class Main
{
    public static void main(String[] args) {
        
        Cylinder c = new Cylinder(2.0, 5.0);
        System.out.println(c.getVolume());
        
        Ball b = new Ball(3.0);
        System.out.println(b.getVolume());
        
        Pyramid p = new Pyramid(4.0, 3.0);
        System.out.println(p.getVolume());
        
        Box box = new Box(100.0);
        System.out.println(box.add(p));
        System.out.println(box.add(b));
        System.out.println(box.add(c));
        
    }
}

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Comparable> a = new ArrayList<Comparable>();
        a.add(new MyClass(1));
        a.add(new MyClass(2));
        a.add(new MyClass(3));
        a.add(new MyClass(5));
        try{
            System.out.println(a);
            System.out.println(MaxAndMin.maxAndMin(a));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

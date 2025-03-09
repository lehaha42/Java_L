import java.util.ArrayList;
import java.util.Collections;
public class Main
{
    public static void main(String[] args) {
        Fraction a = new Fraction(3, 5);
        Fraction b = new Fraction(2, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.compareTo(b));
        
        ArrayList<Fraction> arr = new ArrayList<>();
        for (int i = 0; i<20; i++){
            arr.add(new Fraction((int)(Math.random()*200)-100, 100));
        }
        System.out.println(arr);
        
        natComparator c1 = new natComparator();
        revComparator c2 = new revComparator();
        absNatComparator c3 = new absNatComparator();
        absRevComparator c4 = new absRevComparator();
        Collections.sort(arr, c1);
        System.out.println(arr);
        Collections.sort(arr, c2);
        System.out.println(arr);
        Collections.sort(arr, c3);
        System.out.println(arr);
        Collections.sort(arr, c4);
        System.out.println(arr);
    }
}

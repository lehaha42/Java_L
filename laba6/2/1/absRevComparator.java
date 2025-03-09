import java.util.Comparator;
public class absRevComparator implements Comparator<Fraction>{
    public absRevComparator(){
    }
    
    public int compare(Fraction a, Fraction b){
        return Math.abs(b.numerator * a.denominator) - Math.abs(a.numerator * b.denominator);
    }
}
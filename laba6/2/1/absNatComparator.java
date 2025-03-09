import java.util.Comparator;
public class absNatComparator implements Comparator<Fraction>{
    public absNatComparator(){
    }
    
    public int compare(Fraction a, Fraction b){
        return Math.abs(a.numerator * b.denominator) - Math.abs(b.numerator * a.denominator);
    }
}
import java.util.Comparator;
public class revComparator implements Comparator<Fraction>{
    public revComparator(){
    }
    
    public int compare(Fraction a, Fraction b){
        return b.numerator * a.denominator - a.numerator * b.denominator;
    }
}
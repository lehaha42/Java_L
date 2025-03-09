import java.util.Comparator;
public class natComparator implements Comparator<Fraction>{
    public natComparator(){
    }
    
    public int compare(Fraction a, Fraction b){
        return a.numerator * b.denominator - b.numerator * a.denominator;
    }
}
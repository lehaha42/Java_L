public class Fraction implements Comparable{
    int numerator, denominator;
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int compareTo(Object other){
        if(other instanceof Fraction){
            return this.numerator * ((Fraction)other).denominator - ((Fraction)other).numerator * this.denominator;
        }
        return 0;
    }
    
    public String toString(){
        return numerator+"/"+denominator;
    }
}
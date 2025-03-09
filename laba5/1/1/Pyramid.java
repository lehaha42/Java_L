public class Pyramid extends Shape{
    private double s, h;
    
    public Pyramid(double s, double h){
        this.s = s;
        this.h = h;
    }
    
    double getVolume(){
        return s * h / 3;
    }
}
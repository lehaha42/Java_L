public class Triangle extends GeometricObject{
    private double side1, side2, side3;
    
    Triangle(){
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    
    Triangle(double _side1, double _side2, double _side3) {
        super();
        side1 = _side1;
        side2 = _side2;
        side3 = _side3;
    }
    
    public String toString() {
        return "стороны: " + side1 + ", " + side2 + ", " + side3 + "\n" + super.toString();
    }
  
    /** Возвращает площадь */
    public double getArea() {
        double p = this.getPerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    /** Возвращает периметр */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
}
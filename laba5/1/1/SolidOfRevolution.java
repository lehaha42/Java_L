public abstract class SolidOfRevolution extends Shape{
    protected double radius;
    
    protected SolidOfRevolution(){}
    
    protected SolidOfRevolution(double radius){
        this.radius = radius;
    }
    
    abstract double getRadius();
    
}
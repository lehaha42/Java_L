public class Cylinder extends SolidOfRevolution{
    private double height;
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    double getRadius(){
        return super.radius;
    }
    
    double getVolume(){
        return height * 3.14159265359 * super.radius * super.radius;
    }
}
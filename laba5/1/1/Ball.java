public class Ball extends SolidOfRevolution{
    private double height;
    
    public Ball(double radius){
        super(radius);
    }
    
    double getRadius(){
        return super.radius;
    }
    
    double getVolume(){
        return 4/3 * 3.14159265359 * super.radius * super.radius * super.radius;
    }
}
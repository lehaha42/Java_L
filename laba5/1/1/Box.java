import java.util.ArrayList;

public class Box extends Shape{
    ArrayList<Shape> arr = new ArrayList<Shape>();
    private double volume, maxVolume;
    
    public Box(double vol){
        maxVolume = vol;
        volume = 0;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getMaxVolume(){
        return maxVolume;
    }
    
    public boolean add(Shape s){
        if ((maxVolume - volume) > s.getVolume()){
            arr.add(s);
            volume += s.getVolume();
            return true;
        }else{
            return false;
        }
    }
    
}
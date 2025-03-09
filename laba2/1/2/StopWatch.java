
public class StopWatch{
    private long startTime=-1, endTime=-1;
    
    StopWatch (){
        this.start();
    }
    
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        return (this.endTime == -1) ? -1 : this.endTime - this.startTime;
    }
    public static void main(String[] args) {}
}
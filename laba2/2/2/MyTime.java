class MyTime{
    private int hour, minute, second;
    
    MyTime(){
        this.parseTime((long)(System.currentTimeMillis()/1000));
    }
    
    MyTime(long timeMillis){
        this.parseTime((long)(timeMillis/1000));
    }
    
    MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    private void parseTime(long timeSecs){
        long time = timeSecs;
        this.second = (int)time%60;
        time = (long)(time/60);
        this.minute = (int)time%60;
        time = (long)(time/60);
        this.hour = (int)time%24;
    }
    
    public void setTime(long elapseTime){
        this.parseTime((long)(elapseTime/1000) + this.second + this.minute*60 + this.hour*3600);
    }
    
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
}
class MyClass implements Comparable{
    private int n;
    
    public MyClass(){
        n = (int)(Math.random()*100.0);
    }
    
    public MyClass(int _n){
        n = _n;
    }
    
    public int getN(){
        return n;
    }
    
    @Override
    public int compareTo(Object o){
        if (o instanceof MyClass)  
            return n-((MyClass)o).getN();
        else
            return 0;
    }
    
    public String toString(){
        return n+"";
    }
}
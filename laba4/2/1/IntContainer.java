public class IntContainer{
    private int arr[];
    private int leng, p;
    
    public IintContainer(int length){
        this.leng = length;
        arr = new int[length];
        p = 0;
    }
    
    public void push(int a){
        if(p < leng){
            arr[p] = a;
            p++;
        }else{
            throw new ContainrOverFlowException();
        }
    }
    
    public int pop(){
        if (p > 0){
            return arr[p--];
        }else{
            throw new EmptyIntContainerException();
        }
    }
    
    public void sort(){
        if (p > 0){
            for (int i = 0; i < p; i++){
                for (int j = 0; j < i; j++){
                    if(arr[j] < arr[j + 1]){
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }else{
                        if (arr[j] == arr[j + 1]){
                            throw new EqalNumbersException();
                        }
                    }
                }
            }
        }else{
            throw new EmptyIntContainerException();
        }
    }
}


public class Main
{
    public static void main(String[] args) {//не проверил. выкидывает из-за таймаута
        StopWatch watch = new StopWatch();
        int[] arr = new int[100_000];
        for(int i = 0; i<100_000; i++){
            arr[i] = (int)(Math.random() * 100_000);
        }
        watch.start();
        for(int i = 99_999; i>=0; i--){
            for(int j = 0; j<i; j++){
                if (arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}


public class Main
{
    public static void main(String[] args) {
        double arr[][] = new double [3][4];
        for (int i  = 0; i < arr.length; i++){
            for (int j = 0 ;j < arr[i].length; j++){
                arr[i][j] = ((int)(Math.random() * 100)/10.0);
                System.out.print(arr[i][j]+", ");
            }
        System.out.println();
        }
    Location result = Location.locateLargest(arr);
    System.out.println(result.maxValue+" at ["+result.row+", "+result.column+"]");
    }
}

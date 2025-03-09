class Location{
    public int row, column;
    public double maxValue;
    
    public static Location locateLargest(double[][] arr){
        Location result = new Location();
        result.maxValue = arr[0][0];
        result.row = 0;
        result.column = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if (result.maxValue < arr[i][j]){
                    result.maxValue = arr[i][j];
                    result.row = i;
                    result.column = j;
                }
            }
        }
        return result;
    }
    
}
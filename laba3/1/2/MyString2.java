class MyString2{
    char[] arr;
    public MyString2(char[] chars){
        arr = new char[chars.length];
        for (int i = 0; i<chars.length; i++){
            arr[i] = chars[i];
        }
    }
    public MyString2 substring(int begin){
        char[] new_arr = new char[arr.length - begin];
        for (int i = 0; i < arr.length - begin; i++){
            new_arr[i] = arr[i + begin];
        }
        return new MyString2(new_arr);
    }
    public MyString2 substring(int begin, int end){
        end = (end > arr.length) ? (arr.length) : (end);
        char[] new_arr = new char[end - begin];
        for (int i = 0; i< end - begin; i++){
            new_arr[i] = arr[i + begin];
        }
        return new MyString2(new_arr);
    }
    public boolean equals(Object obj){
        if(obj instanceof MyString2){
            MyString2 str = (MyString2)obj;
            if (str.arr.length == arr.length){
                for (int i = 0; i<arr.length; i++) if (str.arr[i] != arr[i]) return false;
                return true;
            }
        }
        return false;
    }
    public int compareTo(MyString2 obj){
        int leng = (obj.arr.length > arr.length) ? (arr.length) : (obj.arr.length);
        for (int i = 0; i<leng; i++) if(obj.arr[i] != arr[i]) return obj.arr[i] - arr[i];
        return 0;
    }
    public char[] toChars(){
        return arr;
    }
    public static MyString2 valueOf(boolean b){
        char[] tr = {'t', 'r', 'u', 'e'};
        char[] fl = {'f', 'a', 'l', 's', 'e'};
        if (b){
            return new MyString2(tr);
        }else{
            return new MyString2(fl);
        }
    }
}
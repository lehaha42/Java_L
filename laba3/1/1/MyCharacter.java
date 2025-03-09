class MyCharacter{
    private static final char[] chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!?@#$%^&*_-+=()[]{}<>:;/|\\'\"".toCharArray();
    private char val;
    
    public MyCharacter(char value){
        this.val = value;
    }
    
    private static int toInt(char c){
        for (int i = 0; i < chars.length; i++){
            if (c == chars[i]) return i;
        }
        return -1;
    }
    
    public char charcharValue(){
        return this.val;
    } 
    
    public int compareTo(MyCharacter anotherCharacter){
        int a = toInt(anotherCharacter.charcharValue());
        int b = toInt(val);
        return (a == b) ? 0 : ((a < b) ? -1 : 1);
    }
    
    public boolean equals(Object anotherCharacter){
        if (anotherCharacter instanceof MyCharacter){
            if (toInt(val) == toInt(((MyCharacter)anotherCharacter).charcharValue())){
                return true;
            }
        }
        return false;
    }
    
    public boolean isDigit(){
        return toInt(val) < 10;
    }
    
    public static boolean isDigit(MyCharacter ch){
        return toInt(ch.charcharValue()) < 10;
    }
    
    public static boolean isLetter(MyCharacter ch){
        int n = toInt(ch.charcharValue());
        return (10 <= n) && (n < 62);
    }
    
    public static boolean isLetterOrDigit(MyCharacter ch){
        return toInt(ch.charcharValue()) < 62;
    }
}
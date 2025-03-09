
public class Main
{
    public static void main(String[] args) {
        char[] text1 = "hi".toCharArray();
        char[] text2 = "hello".toCharArray();
        MyString2 a = new MyString2(text1);
        MyString2 b = new MyString2(text2);
        System.out.println(a.toChars());
        System.out.println(b.toChars());
        System.out.println(b.substring(0, 4).toChars());
        System.out.println(MyString2.valueOf(true).toChars());
    } 
}

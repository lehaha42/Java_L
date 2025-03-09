
public class Main
{
    public static void main(String[] args) {
        MyTime a = new MyTime();
        System.out.println(a.getHour()+":"+a.getMinute()+":"+a.getSecond());
        MyTime b = new MyTime(555550000);
        System.out.println(b.getHour()+":"+b.getMinute()+":"+b.getSecond());
        MyTime c = new MyTime(5, 23, 55);
        System.out.println(c.getHour()+":"+c.getMinute()+":"+c.getSecond());
    }
}

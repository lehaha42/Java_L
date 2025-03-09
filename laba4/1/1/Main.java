
public class Main
{
    public static void main(String[] args) {
        try{
            System.out.println(1);
            Triangle a = new Triangle(1, 1, 1);
            System.out.println(2);
            Triangle b = new Triangle(2, 3, 6);//
            System.out.println(3);
        }
        catch(IllegalTriangleException ex){
            System.out.println("error");
        }
    }
}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double side1, side2, side3;
        String color;
        boolean isFilled;
        Scanner in = new Scanner(System.in);
        
        System.out.println("введите первую сторону:");
        side1 = in.nextDouble();
        System.out.println("введите вторую сторону:");
        side2 = in.nextDouble();
        System.out.println("введите третью сторону:");
        side3 = in.nextDouble();
        System.out.println("введите цвет:");
        color = in.next();
        System.out.println("введите надо ли заливать:");
        isFilled = (in.nextInt() != 0) ? true : false;
        in.close();
        
        Triangle a = new Triangle(side1, side2, side3);
        a.setColor(color);
        a.setFilled(isFilled);
        
        System.out.println("периметр: "+a.getPerimeter());
        System.out.println("площадь: "+a.getArea());
        System.out.println(a);
        
    }
}
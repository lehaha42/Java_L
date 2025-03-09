import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner in = new Scanner(System.in);
        System.out.println("start");
        while (true){
            try{
                int inp = in.nextInt();
                System.out.println("в " + months[inp] + " " + dom[inp] + " дней");
                break;
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("error. index out of bounds");
            }
            catch(java.util.InputMismatchException ex){
                in = new Scanner(System.in);
                System.out.println("error. non integer input");
            }
        }
    }
}

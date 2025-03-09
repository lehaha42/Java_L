public class Main
{
    public static void main(String[] args) {
        GenericStack<Integer> a = new GenericStack<>();
        System.out.println(a.isEmpty());
        for (int i = 0; i < 16; i++){
            a.push(i);
            System.out.println(a);
        }
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.peek());
        System.out.println(a);
    }
}

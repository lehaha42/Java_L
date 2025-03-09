
public class Main
{
    public static void main(String[] args) {
        MyCharacter a = new MyCharacter('e');
        System.out.println("a = "+a.charcharValue());
        System.out.println("a is digit "+a.isDigit());
        System.out.println("a is digit "+MyCharacter.isDigit(a));
        System.out.println("a is letter "+MyCharacter.isLetter(a));
        System.out.println("a is letter or digit "+MyCharacter.isLetterOrDigit(a));
        MyCharacter b = new MyCharacter('3');
        System.out.println("b = "+b.charcharValue());
        System.out.println("b is digit "+b.isDigit());
        System.out.println("b is digit "+MyCharacter.isDigit(b));
        System.out.println("b is letter "+MyCharacter.isLetter(b));
        System.out.println("b is letter or digit "+MyCharacter.isLetterOrDigit(b));
        System.out.println("a compareTo b "+a.compareTo(b));
        System.out.println("a == b "+a.equals(b));
    }
}

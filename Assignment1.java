public class Assignment1 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();

        n1.i = 2;
        n2.i = 5;

        n1.i = n2.i; // n1.i is now 5
        n2.i = 10;   // n2.i is now 10

        System.out.println("n1.i = " + n1.i); // Output will be n1.i = 5
    }
}
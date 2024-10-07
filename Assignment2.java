public class Assignment2 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        
        n1.i = 2;  // n1.i is 2
        n2.i = 5;  // n2.i is 5

        n1 = n2;   // n1 now references the same object as n2
        
        n2.i = 10; // Since n1 and n2 reference the same object, n1.i is now 10
        
        n1.i = 20; // Again, since both n1 and n2 reference the same object, n2.i is now 20
        
        System.out.println("n1.i = " + n1.i); // Output: n1.i = 20
        System.out.println("n2.i = " + n2.i); // Output: n2.i = 20
    }
}
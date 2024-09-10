package MyPackage;
import MyPackage.MyClass;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display();
        
        Vector<String> v = new Vector<>();
        v.add("Hello");
        System.out.println("Vector contains: " + v.get(0));
    }
}

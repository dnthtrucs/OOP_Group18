import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) {
        try {
            // Đổi hướng output đến file "output.txt"
            PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(out);

            // Khởi tạo các đối tượng
            Book book = new Book();
            Time time = new Time();
            Recursion recursion = new Recursion();
            NNCollection nnCollection = new NNCollection();
            NameNumber nameNumber = new NameNumber();

            // In ra thông tin của các đối tượng
            System.out.println(book);           // In biến 'book'
            System.out.println(time);           // In biến 'time'
            System.out.println(recursion);      // In biến 'recursion'
            System.out.println(nnCollection);   // In biến 'nnCollection'
            System.out.println(nameNumber);     // In biến 'nameNumber'

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

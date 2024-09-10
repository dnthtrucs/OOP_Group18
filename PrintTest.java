import static net.mindview.util.Print.*;
import net.mindview.util.Range;

public class PrintTest {
    public static void main(String[] args) {
        print("Available from now on!");
        print(100);
        print(100L);
        print(3.14159);

        // Test Range methods
        int[] range1 = Range.range(5);
        for (int i : range1) {
            printnb(i + " ");
        }
        print();

        int[] range2 = Range.range(2, 8);
        for (int i : range2) {
            printnb(i + " ");
        }
        print();

        int[] range3 = Range.range(2, 20, 3);
        for (int i : range3) {
            printnb(i + " ");
        }
        print();
    }
}

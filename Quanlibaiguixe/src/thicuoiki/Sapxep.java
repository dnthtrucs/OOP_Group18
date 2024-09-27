
package thicuoiki;
import java.util.Comparator;

public class Sapxep implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        int lastIndex1 = words1.length - 1;
        int lastIndex2 = words2.length - 1;

        while (lastIndex1 >= 0 && lastIndex2 >= 0) {
            int result = words1[lastIndex1].compareTo(words2[lastIndex2]);
            if (result != 0) {
                return result;
            }
            lastIndex1--;
            lastIndex2--;
        }

        int firstIndex1 = 0;
        int firstIndex2 = 0;
        while (firstIndex1 < words1.length && firstIndex2 < words2.length) {
            int result = words1[firstIndex1].compareTo(words2[firstIndex2]);
            if (result != 0) {
                return result;
            }
            firstIndex1++;
            firstIndex2++;
        }

        return s1.compareTo(s2);
    }
}


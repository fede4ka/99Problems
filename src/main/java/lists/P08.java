package lists;

import java.util.ArrayList;
import java.util.List;

public class P08 {
    //Eliminate consecutive duplicates of list elements
    public static <T> List<T> compress(List<T> list) {
        List<T> result = new ArrayList<>();
        T lastElement = null;
        for (T e : list) {
            if (!lastElement.equals(e)) {
                result.add(e);
            }
            lastElement = e;
        }
        return result;
    }
}

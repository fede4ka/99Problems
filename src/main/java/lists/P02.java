package lists;

import java.util.List;
import java.util.NoSuchElementException;

public class P02 {
    //Find the last but one element of a list
        public static <T> T secondLast(List<T> list) {
            if (list.size()<2)  {
                throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements");
            }
            return list.get(list.size() - 2);
        }
}

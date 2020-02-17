package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P17 {
    //Split a list into two parts; the length of the first part is given
    static final class ListParts<T> {
        public final List<T> left ;
        public final List<T> right ;
        public ListParts(List<T> left, List<T> right) {
            this.left = left;
            this.right = right;
        }
    }
    public static <T> ListParts<T> split(List<T> list, int n) {
        List<T> left = new ArrayList<>(list.subList(0, n));
        List<T> right = new ArrayList<>(list.subList(n, list.size()));
        return new ListParts<T> (left,right);
    }
}
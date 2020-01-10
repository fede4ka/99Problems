package lists;

import java.util.ArrayList;
import java.util.List;

public class P05_reverse {
    //Reverse a list
    public static <T> List<T> reverse(List<T> list) {
        List<T> result = new ArrayList();
        list.forEach(x->result.add(0,x));
        return result;
    }
}
package lists;

import java.util.ArrayList;
import java.util.List;

public class P09 {
    //Pack consecutive duplicates of list elements into sublists
    public static <T> List<List<T>> pack(List<T> list) {
        T lastElement = null;
        List<List<T>> packedList = new ArrayList<>();
        List<T> elements = new ArrayList<>();
        for (T el : list) {
            if (!lastElement.equals(el)) {
                elements = new ArrayList<>();
                packedList.add(elements);
            }
            elements.add(el);
            lastElement = el;
        }
        return packedList;
    }


}
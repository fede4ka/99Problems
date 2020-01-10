package lists;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class P14 {
    //Duplicate the elements of a list
    public static <T> List<T> duplicate(List<T> list) {
        return list.stream().flatMap(e -> Stream.of(e, e)).collect(toList());
    }
}
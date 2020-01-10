package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class P15 {
//Duplicate the elements of a list a given number of times
    public static <T> List<T> duplicate(final List<T> list, final int times) {
        return list.stream().flatMap(e -> Collections.nCopies(times, e).stream()).collect(toList());
    }

    public static <T> List<T> duplicate2(final List<T> list, final int times) {
        List<T> result = new ArrayList();
        list.forEach(x->{
            for(int i = 0; i < times; i++) result.add(x);
        });
        return result;
    }
}
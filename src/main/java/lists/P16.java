package lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P16 {
//Drop every N'th element from a list
    public static <T> List<T> dropEveryNth(List<T> list, int n) {
        if (n == 0) {
            return list;
        }
        Map<Integer,T> map = new HashMap<>();
        IntStream.range(0, list.size())
                .forEach(x-> map.put(x+1,list.get(x)));
           return map.entrySet()
                    .stream()
                    .filter(x -> x.getKey() % n != 0)
                    .map(Map.Entry::getValue)
                    .collect(Collectors.toList());

    }
}
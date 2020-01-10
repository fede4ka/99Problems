package lists;

import java.util.stream.Stream;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class P07_flatten {
    public static <T> List<T> flatten_stream(List<?> list, Class<T> elementType) {
        return list
                .stream()
                .flatMap(e -> e instanceof List ? flatten_stream(((List<?>) e), elementType).stream() : Stream.of(e))
                .map(e -> (T) e)
                .collect(toList());
    }
}

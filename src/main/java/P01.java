import java.util.List;

public class P01 {
    //Find the last element of a list
    public static <T> T last(List<T> elements) {
        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);

    }

    
}

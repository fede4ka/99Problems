package lists;

import java.util.List;

public class P06 {
    //Find the last element of a list
    public static <T> boolean isPalindrome(List<T> list) {
       return list.equals(P05_reverse.reverse(list));
    }
}
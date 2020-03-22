package algs;

import java.util.Set;
import java.util.stream.Collectors;

public class StringIntersect {

    public static char findChar (String shortOne , String longOne) {
      Set<Character> longSet = longOne.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
      Set<Character> shortSet = shortOne.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
       longSet.removeAll(shortSet);
       return longSet.iterator().next();
    }
}

package lists;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class P17Test {
    @Test
    public void shouldSplitInTwoHalves() throws Exception {
        Assert.assertEquals(P17.split(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"),3).left,
                Arrays.asList("a", "b", "c"));
        Assert.assertEquals(P17.split(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"),3).right,
                Arrays.asList("d", "e", "f", "g", "h", "i", "k"));
    }
}
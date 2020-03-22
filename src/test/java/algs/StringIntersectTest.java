package algs;

import lists.P01;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringIntersectTest {

    @Test
    public void findChar() {

        Assert.assertEquals(StringIntersect.findChar("abca", "aabcf"), 'f');
    }
}
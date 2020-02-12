import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenericMethodTest {
    Integer [] integers = {12,324,6,7900};
    String[] strings = {"Dog","Cat","Lion","Rat","Elephant"};
    @Test
    void print(Integer[] integers) {
        assertArrayEquals(new Integer[]{12, 324, 6, 7900},print(integers));

    }
}
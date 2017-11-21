package ru.pmishagin.rally;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;



public class CopyTest {

    @Test

    public void whenCopy1() {

        int[] copytest = {1, 2, 3, 4, 5};


        Copy arr = new Copy();

        int[] result = arr.copyPartArray(copytest, 1);

        int[] expected = {2, 3, 4, 5};

        assertArrayEquals(result, expected);


    }
}

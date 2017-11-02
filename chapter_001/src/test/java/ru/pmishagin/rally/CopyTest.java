package ru.pmishagin.rally;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;



public class CopyTest {

    @Test

    public void Whencopy1(){



        int[] CopyTest ={1,2,3,4,5};


        Copy arr = new Copy();

        int [] result = arr.copyPartArray(CopyTest,2);

        int[] expected = {3,4,5};

        assertArrayEquals(result, expected);


    }
}

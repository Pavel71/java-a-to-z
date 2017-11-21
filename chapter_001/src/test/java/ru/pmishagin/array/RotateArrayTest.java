package ru.pmishagin.array;


import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version $1.0$
 * @since 01.11.2017
 */



public class RotateArrayTest {

    @Test

    public void rotateTwoArray33() {


        RotateArray rotatetest = new RotateArray();

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = rotatetest.rotate(arr);

        int[][] expectedArray = {{7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };


        assertArrayEquals(result, expectedArray);

    }

    @Test

    public void rotateTwoArray22() {


        RotateArray rotatetest = new RotateArray();

        int[][] arr =  {{1, 2},
                {4, 5},

        };

        int[][] result = rotatetest.rotate(arr);

        int[][] expectedArray = {{4, 1},
                {5, 2},

        };

        assertArrayEquals(result, expectedArray);

    }


}

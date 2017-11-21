package ru.pmishagin.contains;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import java.util.Arrays;
/**
 * Test.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version $1.0$
 * @since 30.10.2017
 *
 */


public class ContainsTest {


    @Test

    public void equTwoString() {


        String origin = "Привет";

        String sub = "иве";

        Contains cont = new Contains();

        boolean result = cont.contains(origin, sub);

        boolean expected = true;

        assertThat(result, is(expected));

    }

}

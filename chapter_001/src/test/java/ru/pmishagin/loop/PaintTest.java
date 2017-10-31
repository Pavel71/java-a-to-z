package ru.pmishagin.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 *
 * @author Pavel Mishagin
 * @version 0.1
 * @since 26.10.2017
 */


public class PaintTest {

    /*
    * Test.
    */

    @Test
    public void whenTwoThenLittleBoard() {
        Paint piramid = new Paint();
        String result = piramid.piramid( 3);
        System.out.println(result);
        assertThat(piramid.piramid(3), is(String.format("  ^  \r\n ^^^ \r\n^^^^^\r\n", System.lineSeparator())));
    }
}
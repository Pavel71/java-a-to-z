package ru.pmishagin.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mishagin
 * @version 0.1
 * @since 26.10.2017
 */

public class BoardTest {
    /*
        * Test.
        */
    @Test
    public void whenTwoThenLittleBoard() {
        Board board = new Board();
        String result = board.paint(6,4);
        System.out.println(result);
        assertThat(board.paint(6, 4), is(String.format(" X X X\r\nX X X \r\n X X X\r\nX X X \r\n", System.lineSeparator())));
    }

    /*
    * Test.
    */

    @Test
    public void whenFourToFiveThenBigBoard() {
        Board board = new Board();
        assertThat(board.paint(4, 5), is(String.format("X X \r\n X X\r\nX X \r\n X X\r\nX X \r\n", System.lineSeparator())));
    }
}
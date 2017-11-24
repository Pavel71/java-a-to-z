package ru.pmishagin.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 23.11.2017
 */

    public class SquareTest {
        @Test
        public void whenDrawSquare() {
            Square square = new Square();
            assertThat(square.pic(), is(
                            new StringBuilder()
                                    .append("++++" + "\n")
                                    .append("++++" + "\n")
                                    .append("++++").toString()));
        }
    }

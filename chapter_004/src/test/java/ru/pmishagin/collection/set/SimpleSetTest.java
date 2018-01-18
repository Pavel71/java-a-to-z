package ru.pmishagin.collection.set;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.12.2017
 */
public class SimpleSetTest {

    @Test
    public void whenNeedAddSet() {

        SimpleSet<String> simpleset = new SimpleSet<>();

        simpleset.add("1");
        simpleset.add("2");


        Iterator<String> iterator = simpleset.iterator();

        iterator.next();

        assertThat(iterator.next(), is("2"));

    }

}
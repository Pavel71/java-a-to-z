package ru.pmishagin.timecollection;

import java.util.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.12.2017
 */
public class TimeTest {

    @Test

    public void whenWeAddSringInCollection() {


        Time time = new Time();

        List<String> arrlist = new ArrayList<>();

        List<String> linklist = new LinkedList<>();

        Set<String> treeset = new TreeSet<>();

        long arr = time.add(arrlist, "Pepapppapapapapapa", 100000);

        long link = time.add(linklist, "Pepapppapapapapapa", 100000);

        long treset = time.add(treeset, "Pepapppapapapapapa", 1000);

        boolean resultlinkarr = link < arr ? true : false;

        //boolean resultarrtreeset = arr < treset ? true : false;

        assertThat(resultlinkarr, is(true));

        //assertThat(resultarrtreeset, is(true));

    }

    @Test

    public void whenWeDellFurstSringInCollection() {

        Time time = new Time();

        List<String> arrlist = new ArrayList<>();

        List<String> linklist = new LinkedList<>();

        Set<String> treeset = new TreeSet<>();

        time.add(arrlist, "Pepapppapapapapapa", 100000);

        time.add(linklist, "Pepapppapapapapapa", 100000);

        time.add(treeset, "Pepapppapapapapapa", 100000);

        long arr = time.delete(arrlist, 1000);

        long link = time.delete(linklist, 1000);

        long treset = time.delete(treeset, 1000);

        boolean resultarrlink = link < arr ? true : false;

        assertThat(resultarrlink, is(true));

    }

}
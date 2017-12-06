package ru.pmishagin.user;

import org.junit.Test;

import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 05.12.2017
 */
public class UserTest {


    @Test

    public void whenSetaddListSortedTreeset() {


        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(

                new User("Pavel", 25),
                new User("Pavel", 21),
                new User("Pavel", 20)));

        Set<User> treeset = new SortUser().sort(list);

        assertThat(treeset.iterator().next().getAge(), is(20));

    }

    @Test

    public void whenlistComparelengtname() {

        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(

                new User("Panakrat", 21),
                new User("Pavel", 25),
                new User("Pontii", 20)));

        new SortUser().sortNameLength(list);

        assertThat(new User("Pavel", 25), is(new SortUser().sortNameLength(list).iterator().next()));
    }

    @Test

    public void whenlistCompareNameandAge() {

        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(

                new User("Panakrat", 21),
                new User("Panakrat", 25),
                new User("Pavel", 25),
                new User("Pavel", 20)));

        new SortUser().sortByAllFields(list);

        assertThat(new User("Pavel", 20), is(new SortUser().sortNameLength(list).iterator().next()));
    }
}

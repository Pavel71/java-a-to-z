package ru.pmishagin.multithreading;

import org.junit.Test;
import ru.pmishagin.multithreading.count.Count;
import ru.pmishagin.multithreading.count.ThreadCount;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.01.2018
 */
public class CountTest {

    @Test

    public void whenCountMultiThreadInc() throws InterruptedException {

        Count count = new Count();

        ThreadCount thread1 = new ThreadCount(count);
        ThreadCount thread2 = new ThreadCount(count);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();


        assertThat(2, is(count.getValue()));



    }
}

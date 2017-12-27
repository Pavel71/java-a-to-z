package ru.pmishagin.multithreading;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 27.12.2017
 */
public class ThredLetterTest {

    @Test

    public void whenCountTwoThreadLetter() throws InterruptedException {

        String str = "111 111 111";

        ThreadLetter thread1 = new ThreadLetter(str);

        thread1.start();
        thread1.join();

        assertThat(9, is(thread1.getCount()));
    }
    @Test

    public void whenCountTwoThreadSpace() throws InterruptedException {

        String str = "111 111 111";

        ThreadSpace thread2 = new ThreadSpace(str);

        thread2.start();
        thread2.join();

        assertThat(2, is(thread2.getCount()));
    }

    public static void main(String[] args) throws InterruptedException {

        int index = 0;

        String str1 = " 123 456 789 122 ";

        ThreadSpace thread1 = new ThreadSpace(str1);

        thread1.start();

        System.out.println("Начало работы Main");

        for (char element : str1.toCharArray()) {

            if (element != ' ') {

                Thread.sleep(1000);

                System.out.println(element);

                index++;

            }
        }

        System.out.println("Конец работы: " + " " + "Количество пробелов: " + thread1.getCount() + " " +
                "Количество символов: " + index);

    }

}
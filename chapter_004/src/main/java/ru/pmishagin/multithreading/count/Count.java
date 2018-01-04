package ru.pmishagin.multithreading.count;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.01.2018
 */

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Класс Счетчика Тестируем многопоточность
 */

/**
 * ThreadSafe аннотанация позволяет определять безопасен многопоточный доступ!
 */

  @ThreadSafe
public class Count {

      @GuardedBy("this")

    private int value;


    public synchronized void increment() {

        this.value++;
    }

    public synchronized int getValue() {

        return this.value;
    }


}

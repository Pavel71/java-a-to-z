package ru.pmishagin.multithreading.practice;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.12.2017
 */
public class TwoLocks {

    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object(); //First lock
    private Object lock2 = new Object(); //Second lock

    public void c1Up() {

        synchronized (lock1) {

            c1++;
        }
    }

    public void c2Up() {

        synchronized (lock2) {

            c2++;
        }
    }
}

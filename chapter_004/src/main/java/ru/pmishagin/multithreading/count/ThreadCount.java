package ru.pmishagin.multithreading.count;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.01.2018
 */
public class ThreadCount extends Thread {

    private Count count;

    public ThreadCount(Count count) {

        this.count = count;
    }

    @Override
    public void run() {

        this.count.increment();
    }

}

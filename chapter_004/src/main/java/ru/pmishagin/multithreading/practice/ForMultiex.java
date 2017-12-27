package ru.pmishagin.multithreading.practice;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.12.2017
 */
public class ForMultiex extends Thread {


    public void run() {

        System.out.println(Thread.currentThread().getName());
    }

    public static void exampleex() {

        for (int i = 0; i < 10; i++) {

            Thread thread = new ForMultiex();

            thread.start();

        }

    }
}

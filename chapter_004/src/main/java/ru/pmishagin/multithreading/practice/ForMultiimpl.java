package ru.pmishagin.multithreading.practice;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.12.2017
 */
public class ForMultiimpl implements Runnable {

    private int index = 0;

    private String name;

    public ForMultiimpl(String name, int index) {

        this.name = name;
        this.index = index;
    }

    public void run() {

        System.out.println(name + " " + index);
    }

    public static void exampleimpl() {

        for (int i = 0; i < 10; i++) {

            Thread thread = new Thread(new ForMultiimpl("Thread", i));

            thread.start();

        }

    }
}

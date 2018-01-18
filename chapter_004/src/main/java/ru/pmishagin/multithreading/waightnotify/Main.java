package ru.pmishagin.multithreading.waightnotify;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 17.01.2018
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

    Que q = new Que();
    Thread consumer = new Thread(new ThreadConsumer(q));
    Thread producer = new Thread(new ProducerThred(q));

    consumer.join();
    producer.join();

        System.out.println("Stop");










    }


}

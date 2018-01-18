package ru.pmishagin.multithreading.waightnotify;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.01.2018
 */
public class ProducerThred implements Runnable {

    Que q;

    ProducerThred(Que q) {

        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    public void run() {

        while (true) {
            q.addN();
        }

    }


}

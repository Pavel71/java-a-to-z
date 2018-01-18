package ru.pmishagin.multithreading.waightnotify;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 17.01.2018
 */
public class ThreadConsumer implements Runnable {

    Que q;

    public ThreadConsumer(Que q) {

        this.q = q;
        new Thread(this, "Потребитель").start();
    }


    public void run() {

          while (true) {
              q.dellN();
          }

    }
}

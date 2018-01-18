package ru.pmishagin.multithreading.waightnotify;

import com.sun.jmx.remote.internal.ArrayQueue;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.01.2018
 */
public class Que {

   private final Object lock = new Object();

    private int n = 0;

    private ArrayQueue<Integer> arrquie = new ArrayQueue<>(10);

   //private boolean valueSet = false;



    public void dellN() {

        synchronized (this.lock) {

            while (arrquie.isEmpty()) {

                try {

                    System.out.println("Очередь пустая! Жду активации: " + n);
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("Исключение Interupted Exeption" + e);
                }

            }

            arrquie.remove(0);
            n--;
           // valueSet = false;
            System.out.println(String.format("%s, Удаленно: ", n));
            lock.notify();


        }



    }

    public  void addN() {

        synchronized (this.lock) {

            while (n >= 10) {

                try {
                    System.out.println("Очередь набита! Жду очищения: " + n);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            arrquie.add(n++);
            //valueSet = true;
            System.out.println(String.format("%s, Прибавленно: ", n));
            lock.notify();
        }


    }
}

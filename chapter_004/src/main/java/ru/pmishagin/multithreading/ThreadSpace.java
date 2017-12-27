package ru.pmishagin.multithreading;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 27.12.2017
 */
public class ThreadSpace extends Thread {

    private String arr;

    private char[] chararray;

    private  int count = 0;

    private long time = 0;


    public ThreadSpace(String arr) {

        this.arr = arr;

        this.chararray = arr.toCharArray();
    }


    public int getCount() {

        return this.count;
    }


    /**
     * Переопределяем метод.Переключение флага!Вмешатсяя или нет!
     * @return
     */
//    @Override
//
//    public boolean isInterrupted() {
//
//        return time > 100000000;
//    }

    public long getTime() {

        return this.time;
    }

    public void run() {

        long start = System.nanoTime();

        System.out.println("Работа дополнительного потока");

        for (char element : chararray) {

            if (!Thread.interrupted()) {

                if (element == ' ') {

                    try {

                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        //e.printStackTrace();

                        System.out.println("Прерывание побочного потока");
                        return;
                    }

                    System.out.println(element);

                    this.count++;

                    time = System.nanoTime() - start;

//                if (isInterrupted()) {
//
//                    System.out.println("Время!");
//
//                    break;
//                }

                }

            } else {

                return;
            }


        }

        //System.out.println(count);
    }
}

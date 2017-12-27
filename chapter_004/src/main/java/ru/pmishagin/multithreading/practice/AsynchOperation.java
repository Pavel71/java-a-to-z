package ru.pmishagin.multithreading.practice;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.12.2017
 */

/**
 * Асинхронная многопоточность
 */
public class AsynchOperation {

    public static final class Calculate implements Runnable {

        private final String name;

        public Calculate(String name) {

            this.name = name;
        }

        public void run() {

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println(String.format("%s Todo asynch", this.name));
        }
    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");

        Thread thread = new Thread(new Calculate("thread1"));

        thread.start();
        thread.join();

//        new Thread() {
//            @Override
//            public void run() {
//                System.out.println("Thread anon Todo asynch");
//            }
//        }.start();

        System.out.println("Finish");


    }


}

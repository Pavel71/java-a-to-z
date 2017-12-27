package ru.pmishagin.multithreading;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 27.12.2017
 */
public class Test {


    public static void main(String[] args) throws InterruptedException {

        ThreadLetter thread = new ThreadLetter("111 111 111");

        System.out.println(thread.getChararray());

        thread.start();
        //thread.join();




        System.out.println(thread.getCount());




    }
}

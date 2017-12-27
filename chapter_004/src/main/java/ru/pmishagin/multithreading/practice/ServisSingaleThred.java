package ru.pmishagin.multithreading.practice;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.12.2017
 */
public class ServisSingaleThred {

    private boolean needdoSamfing;


    public void run() throws InterruptedException {

        while (true) {

            if (needdoSamfing) {


                // dosomfing();
            }
            Thread.sleep(10000);


        }

    }
}

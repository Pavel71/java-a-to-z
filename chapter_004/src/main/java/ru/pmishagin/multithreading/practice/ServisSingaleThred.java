package ru.pmishagin.multithreading.practice;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.12.2017
 */
public class ServisSingaleThred {

    private boolean needdoSamfing;

    int i = 0;


    public void run() throws InterruptedException {

        while (true) {

            if (needdoSamfing) {

                i++; //Это просто для заполнения блока

                 //Todo
                // dosomfing();
            }
            Thread.sleep(10000);


        }

    }
}

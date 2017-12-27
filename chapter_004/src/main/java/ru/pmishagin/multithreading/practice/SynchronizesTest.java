package ru.pmishagin.multithreading.practice;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.12.2017
 */

/**
 * Тест метод!
 * 2 потока пытаются достучатся до метода dowork.
 * Нужно внести изменения что после стопа потоки останавливаются сразу.
 */
public class SynchronizesTest {

    private boolean canwork = true; //Либо делаем эту переменную volatile.Это означает что если идет изменение
                                    // то сначало меняем, потом читаем!

    public void dowork() {          //Или делаем 2 метода Synchronized.Тогда методы пропускаю по 1 потоку.
                                    //1 вышедший из Синхрона вносит изменения, которые сразу доступны другим потокам

        if(canwork) {

            //doSamthing
        }
    }

    public void stop() {

        canwork = false;
    }
}

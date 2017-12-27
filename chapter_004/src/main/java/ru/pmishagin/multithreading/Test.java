package ru.pmishagin.multithreading;

import ru.pmishagin.multithreading.ThreadSpace;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 27.12.2017
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        int index = 0;

        String str1 = " 1 2 3 4 5 6 7 8 9 1 2 3 ";

        ThreadSpace thread1 = new ThreadSpace(str1);

        System.out.println("Начало работы Main");

        thread1.start();



        for (char element : str1.toCharArray()) {

            if (element != ' ') {


                Thread.sleep(100);

                System.out.println(element);

                index++;

                if (thread1.getTime() > 10000000) {

                    thread1.interrupt();
                }

            }
        }

        System.out.println("Конец работы: " + " " + "Количество пробелов: " + thread1.getCount() + " "
                + "Количество символов: " + index);

    }
}

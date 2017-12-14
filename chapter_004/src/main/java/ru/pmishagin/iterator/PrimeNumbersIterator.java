package ru.pmishagin.iterator;

import java.util.NoSuchElementException;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 14.12.2017
 */
public class PrimeNumbersIterator {


    /**
     * Программа создает Итератор, Щелкаюий только простые числа!
     * Может делится на 1 или на себя!
     * Для Массива
     */


    private final int[] values;

    private int index = 0;


    public PrimeNumbersIterator(final int[] values) {

        this.values = values;
    }

    /**
     * Метод начинает отсчет от последней итерации полсе некста
     * И ищет есть ли еще простое число впереди!
     *
     * @return
     */



    /**
     * Метод возвращает только простые значения
     * Если цикл не попадает на четное то просто прибавляем к индексу!
     * Здесь реализован вызов самого же себя
     *
     * @return
     * @throws
     */

    public Object next() {


            for (int j = 2; j < values[index]; j++) {

                while (values[index] % j == 0) {

                    index++;
                }

            } return values[index++];

    }
}

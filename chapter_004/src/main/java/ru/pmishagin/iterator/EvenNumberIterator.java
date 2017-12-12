package ru.pmishagin.iterator;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 12.12.2017
 */

import java.util.NoSuchElementException;

/**
 *
 * Программа создает Итератор, Щелкаюий только четные числа!
 *
 * Для Массива
 */


public class EvenNumberIterator {


    private final int[] values;

    private int index = 0;;

    public EvenNumberIterator(final int[] values) {

        this.values = values;
    }

    /**
     *Метод начинает отсчет от последней итерации полсе некста
     *И ищет есть ли еще четное число впереди!
     * @return
     */

    public boolean hasNext() {

        int hasnext = this.index;

        while (hasnext < values.length) {

            int number = values[hasnext++];

            if (number % 2 == 0) {

                return true; //Пока есть Четные вернет тру!
            }



        } return false; // Если впереди четных нет вернет false!


    }

    /**
     *Метод возвращает только четные значения
     * Если цикл не попадает на четное то просто прибавляем к индексу!
     * Здесь реализован вызов самого же себя
     * @return
     * @throws RuntimeException
     */

    public Object next() throws RuntimeException {


        if (values[index] % 2 != 1) {

            return values[index++];


        } else if (values[index] % 2 != 0) {

            index++;

        }
        try {

            return next(); //Запускаем заново метод пока не вернем true или false
                           //Ловим ошибку массива и перепрофилируем ее в нет четного числа

        } catch (ArrayIndexOutOfBoundsException e) {


            throw new NoSuchElementException("Not found Even Numbers!");
        }
    }
}





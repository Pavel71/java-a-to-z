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
     * Метод возвращает true или false
     * Если число простое.
     */

    public boolean primenumber(int i) {

        for (int j = 2; j < i; j++) {

            if (i % j == 0) {

                return false;

            }

        } return true;

    }


    /**
     * Метод начинает отсчет от последней итерации полсе некста
     * И ищет есть ли еще простое число впереди!
     *
     * @return
     */



    public boolean hasNext() {


          for (int primehesnext = index; primehesnext < values.length; primehesnext++) {

              int number = values[primehesnext];


              if (primenumber(number)) {

                  return true;
              }

          } return false;
    }


    /**
     * Метод возвращает только простые значения
     * Если цикл не попадает на четное то просто прибавляем к индексу!
     * Здесь реализован вызов самого же себя
     *
     * @return
     * @throws
     */

    public Object next() throws RuntimeException {



            while (index < values.length) {

                int prime = values[index++];

                if (primenumber(prime)) {

                    return prime;
                }

            } throw new NoSuchElementException("Prime not found");



        /*

        int prime = values[index++];

        if (primenumber(prime)) {

            return prime;

        } else {

            try {

                return next();

            } catch (ArrayIndexOutOfBoundsException a) {

                throw new
            }
        }*/
    }


}

package ru.pmishagin.loop;

/**
 *  Counter class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.10.2017
 */


public class Counter {

    /**
     * Method: Вычесляем сумму четных чисел от 1 до 10.
     *
     * @author Pavel Mishagin (mailto:raz_3@mail.ru)
     * @param start - 1
     * @param finish - 10
     * @return Результат суммы всех четных чисел
     * @version 0.1
     * @since 25.10.2017
     */


    public int add (int start, int finish) {



        int result = 0;


        for( int i = start; i<=finish; i++){

            if(i % 2== 0){

                result = result+i;
            }

        }
        return result;

    }


}

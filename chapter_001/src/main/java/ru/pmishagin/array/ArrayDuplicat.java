package ru.pmishagin.array;
/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.11.2017
 */

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @param unique размер уникальных значений
 * @param remove возвращает массив без дубликатов
 * @return возвращает перевернутый массив
 *
 */



public class ArrayDuplicat{



    public String[] remove(String[] array) {

        int unique = array.length;



        for (int out = 0; out < unique; out++){ //Внешний цикл

            for(int in = out+1;in<unique;in++){ //Внутренний цикл

                 if(array[out].equals(array[in])){ //Если 2 значения равны

                    array[in]=array[unique-1]; // то меняем местами с последним

                    unique--;
                    in--;

                 }

            }

        }
        return Arrays.copyOf(array,unique);//Копируем исходный массив отрезая дубликаты


    }


}




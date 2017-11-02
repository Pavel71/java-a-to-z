package ru.pmishagin.array;

/**
 * Метод sort Отсортировать массив от меньшего к большему.
 * @param  array массив.
 * @return возвращает обработанный массив .
 */
public class BubleSort {


    public int[] sort(int[] array){

        //int a = array[i];
        //int b = array[i+1];

        for(int i = array.length-1 ; i > 0 ; i--) {


            for (int j = 0; j < i; j++) {


            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/

                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }return array;

    }
}

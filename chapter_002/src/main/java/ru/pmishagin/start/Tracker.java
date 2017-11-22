package ru.pmishagin.start;

import com.sun.org.apache.xpath.internal.SourceTree;
import ru.pmishagin.models.*;
import java.util.*;
/**
 *  Tracker.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.11.2017
 */

/**
 * В данном классе хранятся все заявки.
 * Возможно добавлять, редактировать и удалять заявки, также
 * возможен вывод списка всех заявок и вывод списка по фильтру.
 */

public class Tracker {

   private Item[] items = new Item[10]; /////Массив объектов Items Заменяет базу данных//////////
   private int position = 0; ////////Это по сути накопение количества заявок или задач/////////
   private static final Random RN = new Random(); ////Cтатическая константа для генераци случаного айди/////



    /**
     * Метод добавляет заявку в массив items
     * @param item
     * @return
     */


   public Item add(Item item) {

       item.setId(this.generateId()); ////////////Метод генерирует случайное число и переводит его в строку(ID)

       this.items[position++] = item; /////////// Это идет наполнение массива

       return item;
   }

    /**
     * Метод ищет заявку по id
     * @param id
     * @return
     */

   protected Item findById(String id) {

       Item result = null;

       for (Item item :items) {

           if (item != null && item.getId().equals(id)) {

               result = item;

               break;
           }

       }
       return result;

   }

    /**
     * Метод генерирует случайное число из текущего времени(милисекунды) + рандомный инт
     * @return
     */

   String generateId() {

       //valueOf преобразует инт в строку

       return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
   }

    /**
     * Метод выводит те значения которыые не равны null
     * @return
     */

   public Item[] getAll() {

       Item[] result = new Item[position]; //Массив чистых заявок

       for (int index = 0; index != this.position; index++) {

           if (items[index] != null) {

               result[index] = this.items[index]; //присваиваем массив чистых завок нашей базе
           }
       }
       return result;

   }


    /**
     * Метод выводит на экран все заявки которые есть в массиве
     */

   public void showAllItem() {

       for (int i = 0; i < position; i++) {

           System.out.println("------------ Все заявки --------------");

           System.out.println(" Name : " + items[i].getName() + " " + "Description: " + items[i].description + " " + "Id: " + items[i].getId());
       }
   }

    /**
     * Метод заменяет старую заявку на новую с помощь id
     * @param item
     */

   public void update(Item item) {

       for (int index = 0; index < items.length; index++) {

           if (items[index].getId().equals(item.getId())) {

               items[index] = item;

               break;
           }
       }


   }

    /**
     * Метод находи нужжную заявку по id и присваивает ей null
     * @param item
     */

    public void delete(Item item) {

       for (int index = 0; index < items.length; index++) {

           if (items[index].getId().equals(item.getId())) {

               items[index] = null;

               break;
           }

       }
    }

    /**
     *
     * Поиск заявки о ключу.
     * @param key
     * @return
     */

   public Item findByName(String key) {

        Item result = null;

        for (int index = 0; index < items.length; index++) {

            if (items[index].name.equals(key)) {

                result = items[index];

                break;
            }

        }
        return result;


    }

}

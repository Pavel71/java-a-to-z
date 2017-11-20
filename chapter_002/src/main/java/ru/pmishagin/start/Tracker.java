package ru.pmishagin.start;

import ru.pmishagin.models.*;
import java.util.*;


/**
 * В данном классе хранятся все заявки.
 * Возможно добавлять, редактировать и удалять заявки, также
 * возможен вывод списка всех заявок и вывод списка по фильтру.
 */

public class Tracker {

   private Item[] items = new Item[10];/////Массив объектов Items Заменяет базу данных//////////
   private int position = 0;////////Это по сути накопение количества заявок или задач/////////
   private static final Random RN = new Random();////Cтатическая константа для генераци случаного айди/////




////////////Метод добавляет заявки в виде строк///////////////

   public Item add(Item item){

       item.setId(this.generateId()); ////////////Метод генерирует случайное число и переводит его в строку(ID)

       this.items[position++] = item; /////////// Это идет наполнение массива

       return item;
   }

   /////////////////////////Метод поиска заявок c помощью id////////////

   protected Item findById(String id){

       Item result = null;

       for (Item item :items){
           if(item !=null && item.getId().equals(id)){

               result = item;
               break;
           }

       }
       return result;

   }

   //////////////Метод генерирует Случайное число и преобразует его в строку/////////////////////

   String generateId(){

       return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
   }

   ////////////////Этот метод выводит только те элементы из массива которые вставленнны/////////

   public Item[] getAll(){

       Item []result = new Item[position];

       for (int index=0;index!=this.position;index++){

           if(items[index]!=null) {

               result[index] = this.items[index];
           }
       }
       return result;


       /////////Метод поиска всех заявок/////////
   }

   public int getPosition(){

       return this.position;
   }

   /**
    * param Item items[]

    */

   //////Метод обновляет данные в завяке(Работает с массивом)//////////

   public void update(Item item){

       for(int index = 0;index<items.length;index++){

           if(items[index].getId().equals(item.getId())){

               items[index]=item;

               break;
           }
       }


   }

   /////////////////////////Метод удаления заявок/////////////////

    public void delete(Item item){

       for(int index = 0;index<items.length;index++) {

           if (items[index].getId().equals(item.getId())) {

               items[index] = null;

               break;
           }

       }
    }

    ////////////////////////Получение списка по имени///////////////

   public Item findByName(String key){

        Item result = null;

        for(int index = 0;index<items.length;index++){

            if(items[index].name.equals(key)){

                result = items[index];
                break;
            }

        }
        return result;


    }

}

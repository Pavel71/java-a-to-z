package ru.pmishagin.user;

import java.util.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.12.2017
 */
public class UserConvert {


    public HashMap<Integer, User> process(List<User> list) {

        HashMap<Integer, User> map = new HashMap<>();

        for (User userval : list) {

            map.put(new User().id++, userval);


        }
          return map;

    }




    public static void main(String[] args) {




        //System.out.println(user);


        Map<Integer, User> map = new HashMap<>();



        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(new User("Pavel", "Tula"), new User("Petr", "Tula"), new User("Pankrat", "Tula")));



        for (User userval : list) {

            map.put(new User().id++, userval);

        }

       // System.out.println(map);

        /**
         * Можно пробежатся по мапе с помощью интерфйса ЭнтриМап
         * Дальше можно работать с каждм элементом добавлиять удалять и тд!
         */


        for (Map.Entry<Integer, User> user : map.entrySet()) {

            //user.getKey();
           // user.getValue();

            System.out.println("Ключ :" + user.getKey() + " " + "Значение : " + user.getValue());

        }

        Map<Integer, User> map2 = new HashMap<>(map);

        System.out.println("Это Map2 :" + map2);








        //for(Map.Entry<Integer, User> item : map.entrySet()) {


        //

    }




    //public HashMap<Integer , User> process(List<User> list) {



      //  Map<Integer, User> map = new HashMap<>();

     //   for (User user : list) {


          // list = map.values();
      //  }




}

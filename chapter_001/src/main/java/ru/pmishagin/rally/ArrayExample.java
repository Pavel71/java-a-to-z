package ru.pmishagin.rally;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.10.2017
 */

public class ArrayExample {

    public static void main(String[] args) {

    /* String[] values = new String[10];

     values[0] = "one";
        values[1] = "two";
        values[2] = "third";

    */ //Первый вариант присвоения данных массиву

        // String[] names = new String []{"pavel","julia","mark"};//Присваиваем данные сразу!

        /*for (int index = 0; index!= names.length;index++){

            System.out.println(names[index]);

        }Это первый вариан вызова массива! Не самый лучший способ.*/

       /* for (String name : names){//Цыкл for age пробегается по массиву.
       Сначало тип данных потом название массива.

            System.out.println(name);Вызываем именно по имени данных

        }*/

        User[] users = new User[5];

        users[0] = new User("Pavel");

        users[1] = new User("Mark");

        users[2] = new User("Vladimir");

        users[3] = new User("Julia");

        users[4] = new User("Petr");

        User user = ArrayExample.findByName(users, "Mark");

        System.out.println(user.name);

    }


    public static User findByName(User[] users, String name) {

        User result = null;

        for (User user : users) {

            if (name.equals(user.name)) {

                result = user;

                break;
            }
        } return result;
    }
}



package ru.pmishagin.user;

import java.util.Random;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.12.2017
 */

public class User {


    private String name;

    private String city;

    static int id = 1;

    //private static final Random RN = new Random();



    public User() {


    }

    public User(String name, String city) {


        this.name = name;

        this.city = city;


    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {

        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Пользователь:" + "Имя:" + name + '\'' + ", Город проживания:" + city;
    }
}

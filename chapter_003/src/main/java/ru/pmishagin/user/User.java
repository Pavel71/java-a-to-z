package ru.pmishagin.user;

import java.util.Random;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.12.2017
 */

public class User implements Comparable<User> {



    private String name;

    private String city;

    private int age;

    static int id = 1;

    //private static final Random RN = new Random();


    @Override
    public int compareTo(User o) {

        int rsl = this.name.compareTo(o.name);

        return rsl != 0 ? rsl : Integer.compare(this.age, o.age);

    }

    public User() {


    }

    public User(String name, String city) {


        this.name = name;

        this.city = city;


    }

    public User(String name, String city, int age) {


        this.name = name;

        this.age = age;

        this.city = city;

    }
    public User(String name, int age) {


        this.name = name;

        this.age = age;


    }

    public String getName() {

        return this.name;
    }

    public int getAge() {

        return this.age;
    }

    public String getCity() {

        return this.city;
    }


    @Override
    public String toString() {
        return "Пользователь:" + "Имя:" + name + '\''  /*", Город проживания:" + city*/ + ", Возраст:" + age;
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

        if (age != user.age) {
            return false;
        }

        if (name != null ? !name.equals(user.name) : user.name != null) {
            return false;
        }

        return city != null ? city.equals(user.city) : user.city == null;
    }

    @Override
    public int hashCode() {

        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}

package ru.pmishagin.start.profession.subprofessional;

import ru.pmishagin.start.profession.Profession;

/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */

public class Projects extends Profession {

    public int price;

    public Projects(String name, String specialization, int age,int price) {

        this.name = name;
        this.specialization = specialization;
        this.age = age;
        this.price = price;

    }

    public int getPrice(){

        return price;
    }
}

package ru.pmishagin.start.profession.subprofessional;


import ru.pmishagin.start.profession.Teacher;

/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */

public class Students extends Teacher {

    public Students(String name, String diplom, String specialization, int age) {

        this.name = name;
        this.diplom = diplom;
        this.specialization = specialization;
        this.age = age;

    }


}

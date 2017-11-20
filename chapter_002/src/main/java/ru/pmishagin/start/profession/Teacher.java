package ru.pmishagin.start.profession;

import ru.pmishagin.start.profession.subprofessional.*;
/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */
public class Teacher extends Profession {


    public Teacher(){


    }


    public Teacher(String name, String diplom, String specialization, String profession, int expiriencework, int age) {

        this.name = name;
        this.diplom = diplom;
        this.specialization = specialization;
        this.expiriencework = expiriencework;
        this.age = age;
        this.profession = profession;
    }

    public String knoeledjteach (Students students){

        return students.name;
    }
}

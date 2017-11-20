package ru.pmishagin.start.profession;

import ru.pmishagin.start.profession.subprofessional.Projects;

/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */
public class Enjineer extends Profession{


    public Enjineer(String name, String diplom, String specialization, String profession, int expiriencework, int age) {

        this.name = name;
        this.diplom = diplom;
        this.specialization = specialization;
        this.expiriencework = expiriencework;
        this.age = age;
        this.profession = profession;
    }

    public int getPrice(Projects projects){


        return projects.price;
    }
}

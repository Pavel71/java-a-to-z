package ru.pmishagin.start.profession.subprofessional;

import ru.pmishagin.start.profession.*;

/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */
public class Pacient extends Profession {

    public String diagnos;


    public Pacient(String name, int age,String diagnos) {

        this.name = name;
        this.age = age;
        this.diagnos = diagnos;

    }
    public String getDiagnos(){

        return diagnos;
    }
}

package ru.pmishagin.start.profession;

import ru.pmishagin.start.profession.subprofessional.Pacient;

/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */

 public class Doctor extends Profession {

     int healingpeople;


    public Doctor(int healingpeople, String name, String diplom, String specialization, String profession, int expiriencework, int age) {

        this.name = name;
        this.diplom = diplom;
        this.specialization = specialization;
        this.expiriencework = expiriencework;
        this.age = age;
        this.profession = profession;
        this.healingpeople = healingpeople;
    }

    public String healingpacient(Pacient pacient) {


        return pacient.diagnos;

    }


    public void givsum() {

        System.out.println("Doc giv summ");

    }


 }

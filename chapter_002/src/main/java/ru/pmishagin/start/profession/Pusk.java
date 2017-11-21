package ru.pmishagin.start.profession;

import ru.pmishagin.start.profession.subprofessional.*;


/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */



public class Pusk {


    public static void main(String[] args) {

        Profession prof = new Profession();

        Doctor doc = new Doctor(5, "Boris", "TulGY", "Kardiolog", "Doctor", 5, 45);

        Pacient pac = new Pacient("Tramp", 55, "Shiza");

        Enjineer enj = new Enjineer("Pavel", "TulGY", "Electrosnab", "Enjineer", 1, 35);

        Projects proj = new Projects("Tower", "Bilding", 0, 10000000);

        Teacher teach = new Teacher("Julia", "TPY", "Languager", "Teacher", 6, 28);

        Students stud = new Students("Vladimir", "2 course", "Biologi", 20);

        test(pac);

        enj.getName(enj);

    }



    public static void test(Profession profession) {

       profession.givsum();

    }


}

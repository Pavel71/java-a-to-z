package ru.pmishagin.start.profession;

/**
 *  Profession class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.11.2017
 */


public class Profession {

    public String name;
    public int expiriencework;
    public int age;
    public String diplom;
    public String specialization;
    public String profession;

    public Profession(){


    }

    public Profession(String name,String diplom,String specialization,String profession,int expiriencework,int age){

        this.name = name;
        this.diplom = diplom;
        this.specialization = specialization;
        this.expiriencework = expiriencework;
        this.age = age;
        this.profession = profession;


    }
    public String tostring(){

        return "My name " + name + " ,me  " + age+" years"+ " ,i am a "+profession + " my specializaion "+ specialization + " and expiriance "+ expiriencework+ " years!";
    }

    public void givsum(){

        System.out.println("I giv summ");
    }

    public void gotowork(){

        System.out.println("I go to work ");
    }

    public String getName(Profession profession){

        System.out.println("Hello! My name " + name);

        return name;
    }
    public String getDiplom(){

        System.out.println("Hello! My diplom " + diplom);

        return diplom;
    }
    public String getSpecialization(){

        System.out.println("Hello! My specialization " + specialization);

        return specialization;
    }
    public String getProfession(){

        System.out.println("Hello! My profession " + profession);

        return profession;
    }
    public int getExpiriencework(){

        System.out.println("Hello! My expiriance " + expiriencework+ "years");

        return expiriencework;
    }
    public int getAge(){

        System.out.println("Hello! My age " + age + "years");

        return age;
    }





}

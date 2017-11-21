package ru.pmishagin.gosha;

public class Main {

   public static void main(String[] args) {

   	System.out.println(Person.summ);

      Person maks = new Person(180, 70.1f);

      maks.say("Pipez");

      System.out.println(maks.height);

      Person oleg = new Person();

      oleg.height = 190;

      oleg.weight = 89.1f;

      System.out.println(oleg.height);

      Students vova = new Students(178, 76.5f, 5);

      System.out.println(vova.course);
   }
}

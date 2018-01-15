package ru.pmishagin.nio.directory;

import java.util.Timer;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 15.01.2018
 */
public class Main {

    public static void main(String[] args) {

        String dir = "C:";

        String text = "MyFileVisitor";

        String extc = "java";


        Long startTime = System.currentTimeMillis();


        new WalkDir().dirrTreeList(dir, text, extc);


        Long finishTime = System.currentTimeMillis() - startTime;


        System.out.println(finishTime);

    }


}

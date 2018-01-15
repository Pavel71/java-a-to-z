package ru.pmishagin.nio.directory;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 13.01.2018
 */


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * Программа для Прохождения по директориям и Вывод всх файлов
 */

public class WalkDir {



    public void dirrTreeList(String dirr, String text, String extc) {

        System.out.println("Дерево каталогов начиная с каталога: " + dirr + "\n");

        try {

            MyFileVisitor myfl = new MyFileVisitor(text, extc);

            Files.walkFileTree(Paths.get(dirr), myfl);

            for (String element : myfl.getResult()) {

                System.out.println(element);
            }


        } catch (IOException e) {

            System.out.println("Ошибка Ввода Вывода " + e);
        }


    }

}

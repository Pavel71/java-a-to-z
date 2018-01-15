package ru.pmishagin.multithreading.multisearch;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 15.01.2018
 */
public class ThreadSearch extends Thread {


    private String dirr;

    private MyFileVisitorParallSearch myfl;



    public ThreadSearch(String dirr, MyFileVisitorParallSearch myfl) {

        this.dirr = dirr;
        this.myfl = myfl;

    }


    @Override
    public void run() {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Дерево каталогов начиная с каталога: " + dirr + "\n");

        try {

            Files.walkFileTree(Paths.get(dirr), myfl);


        } catch (IOException e) {

            System.out.println("Ошибка Ввода Вывода " + e);
        }

    }
}

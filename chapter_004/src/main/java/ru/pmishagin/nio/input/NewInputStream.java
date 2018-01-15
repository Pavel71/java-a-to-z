package ru.pmishagin.nio.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 12.01.2018
 */


/**
 * **
 * Эта программа расчитанна на считывание файлов всех типов через байты!
 */

public class NewInputStream {


    public void inputStrem(String filename) {

        int i;

        Path filepath = null;

        //Получаем путь к файлу

        try {

            filepath = Paths.get(filename);

        } catch (InvalidPathException e) {

            System.out.println("Path error: " + e);

        }
        //Получаем канал к этому файлу!

        try (FileInputStream fin = new FileInputStream(String.valueOf(filepath))) { //Открываем оток с нужным местом

            BufferedInputStream bufread = new BufferedInputStream(fin); //Буферр

            do {
                i = bufread.read();
                if (i != -1) {
                    System.out.print((char) i);
                }

            } while (i != -1);

        } catch (IOException e) {

            System.out.println("Error Input/Output" + e);
        }
    }
}

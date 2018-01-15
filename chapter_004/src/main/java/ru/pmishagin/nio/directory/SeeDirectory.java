package ru.pmishagin.nio.directory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 13.01.2018
 */


/**
 * Программа осуществляет поиск по всем каталоам от которых указал!
 */
public class SeeDirectory {

    public void searchDirr(String dirname) {


        // DirectoryStream - Открываем поток который работает по каталлогам файлововй системы

        try (DirectoryStream<Path> dirstr = Files.newDirectoryStream(Paths.get(dirname))) {

            System.out.println("Катаог: " + dirname);

            for (Path entry : dirstr) {

                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory()) {

                    System.out.print("<DIR> ");

                } else {

                    System.out.print("    ");
                }

                System.out.println(entry.getFileName());

            }


        } catch (InvalidPathException e) {

            System.out.println("Path not correct " + e);
        } catch (NotDirectoryException e) {

            System.out.println("Directory nnot found " + e);
        } catch (IOException e) {

            System.out.println("Error Input Output " + e);
        }
    }
}

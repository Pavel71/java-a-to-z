package ru.pmishagin.nio.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 13.01.2018
 */
public class NewFileReader {


    public void myRead(String filename) {

        try (FileReader fr = new FileReader(filename)) {

            BufferedReader bfr = new BufferedReader(fr);

            int c;

            while ((c = bfr.read()) != -1) {

                System.out.print((char) c);
            }


        } catch (IOException e) {

            System.out.println("File not found" + e);
        }

    }
}

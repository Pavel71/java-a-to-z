package ru.pmishagin.nio.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 13.01.2018
 */
public class NewFileWriter {

    public void writeFile(String namefile, String put) {


        try (FileWriter filewr = new FileWriter(namefile, true)) {

            BufferedWriter bfwr = new BufferedWriter(filewr);

            bfwr.write(put);
            bfwr.flush();

        } catch (IOException e) {

            System.out.println("File not found" + e);
        }

    }
}

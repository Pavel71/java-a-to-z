package ru.pmishagin.nio.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 12.01.2018
 */


/**
 * Эта программа расчитанна на добавление файлов всех типов через байты!
 */

public class NewOutputStream {



     public void writeFile(String flename, String textadd) {

         Path path = Paths.get(flename);


         //OLD Variant

//         try (FileOutputStream outs = new FileOutputStream(String.valueOf(path))) {
//             BufferedOutputStream bufs = new BufferedOutputStream(outs);
//         }



         try (java.io.OutputStream outsnew = new BufferedOutputStream(Files.newOutputStream(path, StandardOpenOption.APPEND))) {

             byte[] b = textadd.getBytes();

             outsnew.write(b);
             outsnew.flush();


         } catch (InvalidPathException e) {
             System.out.println("Path uncorrect " + e);
         } catch (IOException e) {
             System.out.println("File not find " + e);
         }

     }


}

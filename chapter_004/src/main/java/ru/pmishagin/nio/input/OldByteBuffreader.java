package ru.pmishagin.nio.input;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 12.01.2018
 */


/**
 * Программа считывает все файлы через байты!Метод реализации старый!
 */
public class OldByteBuffreader {


    public void nioBytebuffReder(String filename) {

        int count;

        Path filepath = null;

        //Получаем путь к файлу

        try {

            filepath = Paths.get(filename);

        } catch (InvalidPathException e) {

            System.out.println("Path error: " + e);

        }
        //Получаем канал к этому файлу!

        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {

            //Выделяем память под буфер

            ByteBuffer mbuf = ByteBuffer.allocate(128);

            //Теперь когда мостик сделали(fChan) и подготовили
            //промежут.память(mbuf) запускаем!

            do {

                count = fChan.read(mbuf); //Возвращает -1 если конец файла

                //Прекратить чтение по достижению конца файла

                if (count != -1) {

                    //Подготовить буфер к чтению из него данных!Возвращает в начало буффера!

                    mbuf.rewind();

                    //Читать байты! данных из буфера и выводить их на экран

                    for (int i = 0; i < count; i++) {

                        System.out.println(mbuf.get());
                    }

                }
            } while (count != -1);


        } catch (IOException i) {

            System.out.println("Error Input/Output" + i);
        }

    }

}

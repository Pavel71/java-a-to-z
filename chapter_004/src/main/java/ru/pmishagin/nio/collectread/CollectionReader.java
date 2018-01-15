package ru.pmishagin.nio.collectread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 13.01.2018
 */
public class CollectionReader {

    public  List<String> getListFile(String fileUrl) throws IOException {

        Path path = Paths.get(fileUrl);

        List<String> list = Files.lines(path).collect(Collectors.toList());

        return list;

    }
}

package ru.pmishagin.multithreading.multisearch;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 15.01.2018
 */
public class MyFileVisitorParallSearch extends SimpleFileVisitor<Path> {


    private String extc;


    private List<String> resultList = new ArrayList<>();

    private ConcurrentHashMap<Path, List<String>> map = new ConcurrentHashMap<>();


    public MyFileVisitorParallSearch(String extc) {

        this.extc = extc;


    }

    public ConcurrentHashMap<Path, List<String>> getMap() {

        return map;
    }


    public List<String> getResultlist() {
        return resultList;
    }



    @Override

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attribs) throws IOException {

        //Ignore Dirr

        Path ignorepath1 = Paths.get("C:\\projects\\java-a-to-z\\.git");

        Path ignorepath2 = Paths.get("C:\\projects\\java-a-to-z\\.idea");


        if (path.equals(ignorepath1) || path.equals(ignorepath2)) {

            return FileVisitResult.SKIP_SUBTREE;

        } else {

            return FileVisitResult.CONTINUE;
        }

    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) throws IOException {

        String myRegex = "\\w+\\." + extc;

        Pattern p = Pattern.compile(myRegex);

        Matcher m = p.matcher(String.valueOf(path));


        if (m.find()) {


            List<String> list = Files.lines(path).collect(Collectors.toList());

            map.put(path, list);



            return FileVisitResult.CONTINUE;

        }


        return FileVisitResult.SKIP_SUBTREE;

    }

}

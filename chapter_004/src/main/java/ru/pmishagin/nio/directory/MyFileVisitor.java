package ru.pmishagin.nio.directory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 13.01.2018
 */
public class MyFileVisitor extends SimpleFileVisitor<Path> {

    private String text;

    private String extc;

    private List<String> result = new ArrayList<>();


    public MyFileVisitor(String text, String extc) {

        this.extc = extc;
        this.text = text;

    }

    public List<String> getResult() {

        return this.result;
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

            //System.out.println(path);

            List<String> listsearch = Files.lines(path).collect(Collectors.toList());

            for (String element: listsearch) {

                Pattern pfind = Pattern.compile("\\b" + text + "\\b");
                Matcher mfind = pfind.matcher(element);

                if (mfind.find()) {

                    result.add(String.valueOf(path));

                    break;
                }
            }



            return FileVisitResult.CONTINUE;
        }


        return FileVisitResult.SKIP_SUBTREE;

    }

//    @Override
//    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
//
//        String myRegex = "\\.(gitignore|travis\\.yml)";
//
//        Pattern p = Pattern.compile(myRegex);
//
//        Matcher m = p.matcher(String.valueOf(path));
//
//        if (m.find()) {
//
//            return FileVisitResult.SKIP_SUBTREE;
//        }
//
//
//        System.out.println(path);
//
//        return FileVisitResult.CONTINUE;
//    }


}

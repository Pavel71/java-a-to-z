package ru.pmishagin.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 11.01.2018
 */
public class FileInputStr {


    private List<String> title;

    private Path path;

    public FileInputStr(String adress) throws IOException {

        this.path = Paths.get(adress);

        this.title = Files.lines(path).collect(Collectors.toList()); //запихивает в коллекцию целые строки!А не по 1 элементу.


    }




    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\projects\\java-a-to-z\\filetest");

        List<List<String>> megaList = new ArrayList<>();

//        for (String element : getListdir(path)) {
//
//
//            megaList.add(getListFile(element, path));
//
//        }

        for (String elem : getListdir(path)) {

            System.out.println(elem);


        }

        List<String> list = getListFile("C:\\projects\\java-a-to-z\\filetest\\TextOne.txt");

        System.out.println(list);







        List<String> number = new ArrayList<>();

        FileInputStr fileInput =  new FileInputStr("C:\\projects\\java-a-to-z\\TestWrite.txt");

        String searchNumb = getInput();


        //fileInput.findNumberText(searchNumb);

        fileInput.searchTextInFile(searchNumb);


    }

    /**
     * Метод выдает Лист данных взятый из файла
     */

    public static List<String> getListFile(String fileurl) throws IOException {

        Path path = Paths.get(fileurl);

        List<String> list = Files.lines(path).collect(Collectors.toList());

        return list;

    }

    /**
     * Метод выдает Массив Стрингов с именем всех файлов в директории!
     */

    public static String[] getListdir(Path dirr) throws IOException {


        File f1 = new File(String.valueOf(dirr));

        String[] dirarr = f1.list();

        return dirarr;

            //Path path = Paths.get(path1 + "\\" + dirr);

    }

    /**
     * Метод пробега по файловой система и получения массива всех файлов в каталоге.
     *
     */

    public void showDir(String path) {

        Path path1 = Paths.get(path);

        File f1 = new File(String.valueOf(path1));

        if (f1.isDirectory()) {

            System.out.println("Каталог " + path1);

            String[] s = f1.list();

            for (int i = 0; i < s.length; i++) {

                File f2 = new File(path1 + "/" + s[i]);

                if (f2.isDirectory()) {

                    System.out.println(s[i] + " Direct");

                } else {

                    System.out.println(s[i] + " File");
                }

            }

        } else {

            System.out.println(path1 + " not dirr");
        }

    }

    // Еще 1 вариант проверить присутсвие элемента в строке

    /**
     * Метод проверят что надо с текстом в файле
     * @param searchNumber
     * @throws IOException
     */

    public void searchTextInFile(String searchNumber) throws IOException {

        boolean infile = this.title.stream().anyMatch(p->p.contains(searchNumber));

        if (infile) {

            System.out.println("good");

        } else {

            System.out.println("Bad");
        }

    }

    public void findNumberText(String searchNumb) {

        for (String element : this.title) {

            if (element.contains(searchNumb)) {

                System.out.println("This Number find");
                break;

            } else {

                System.out.println("This Number not find");
            }

        }



    }


    public static String getInput() {

        Scanner scr = new Scanner(System.in);

        System.out.println("Введите число для поиска!");

        String titleNumb = scr.nextLine();

        scr.close(); //Закрываем ввод

        return titleNumb;

    }







       // System.out.println(title);


    public static void sortNumberoutText(List<String> title, List<String> number) {

        for (String element : title) {

            String myRegex = "(\\d+(\\.\\d*)?)"; // регулярное выражение \d+\w+

            Pattern p = Pattern.compile(myRegex);

            Matcher m = p.matcher(element);

            while (m.find()) {

                number.add(m.group());

            }

        }

    }




    public static Object read(String fileName) {

        try (FileInputStream out = new FileInputStream(fileName)) {   //Если имя файла существет то продожаем

            BufferedInputStream bout = new BufferedInputStream(out);   // Создаем буфер для загрузки данных пачкой

            ObjectInputStream dout = new ObjectInputStream(bout);      // Преобразуем байт код в java чтоы можно было читать

            return dout.readObject();

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();

            return null;
        }
    }
}

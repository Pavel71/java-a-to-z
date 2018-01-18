package ru.pmishagin.multithreading.multisearch;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 15.01.2018
 */



public class ThreadFindText extends Thread {

    private String text;

    private List<String> resultList = new ArrayList<>();

    private MyFileVisitorParallSearch myfl;

    int count = 0;





    public ThreadFindText(String text, MyFileVisitorParallSearch myfl) {

        this.text = text;
        this.myfl = myfl;

    }

    public List<String> getResultList() {

        return resultList;
    }




    public void run() {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (Path path : myfl.getMap().keySet()) {

            for (String element : myfl.getMap().get(path)) {


                Pattern pfind = Pattern.compile("\\b" + text + "\\b");
                Matcher mfind = pfind.matcher(element);

                if (mfind.find()) {


                    myfl.getResultlist().add(String.valueOf(path));
                    break;

                }

            }
        }


    }
}

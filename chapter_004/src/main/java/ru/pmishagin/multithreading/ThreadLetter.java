package ru.pmishagin.multithreading;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 27.12.2017
 */

/**
 * Программа должна считать пробелы в тексте или слова
 */

public class ThreadLetter extends Thread {


    private String arr;

    private char[] chararray;

    private  int count = 0;


    public ThreadLetter(String arr) {

        this.arr = arr;

        this.chararray = arr.toCharArray();
    }


    public int getCount() {

        return this.count;
    }



    public char[] getChararray() {

        return this.chararray;
    }

    public void run() {

        for (char element : chararray) {

            if (element != ' ') {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(element);

                count++;


            }
        }

    }







}

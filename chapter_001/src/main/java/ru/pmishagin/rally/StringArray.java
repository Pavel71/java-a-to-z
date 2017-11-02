package ru.pmishagin.rally;

import java.util.Arrays;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.11.2017
 */

public class StringArray {



    public static void main(String[] args){


        String[] name = new String[] {"Юля","Марк","Паша","Марк","Юля","Кристина","Паша"};


        Arrays.sort(name);



        System.out.print(Arrays.toString(name) + "");


    }


}

package ru.pmishagin.rally;
import java.util.Arrays;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.11.2017
 */

public class Chararray {


    public static void main(String[] args) {


        //Переводим строку в массив charov

        String str = "123";

        char[] chArr = str.toCharArray();

        String str1 = "1234";

        char[] chArr1 = str1.toCharArray();



        String  result = str1.equals(str) ? str1 : str;

        System.out.print(result);


        //System.out.print("String to char array: "+Arrays.toString(chArr)+Arrays.toString(chArr1));

        //Извлекаем символ по индексу
        //char c = str.charAt(0);

        //System.out.println("String to char: "+c);




    }
}
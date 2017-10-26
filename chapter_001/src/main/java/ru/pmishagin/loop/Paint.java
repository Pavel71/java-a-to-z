package ru.pmishagin.loop;


/**
 *  Piramid class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.10.2017
 */


/**Строим пирамиду
 *
 * @param height высота пирамиды
 * @param width ширина пирамиды
 * @param left левая часть пирамиды
 * @param right правая часть пирамиды
 * @return
 */


public class Paint {


    public String piramid(int height) {

        StringBuilder piramid = new StringBuilder();//обращаемся к методу Stringbilder

        int width = 2 * height - 1;

        for (int y = 0; y < height; y++) {

            int widthLevel = y * 2 + 1;//основание пирамиды

            int left = (width - widthLevel) / 2;

            int right = width - left;

            for (int x = 0; x < width; x++) {

                piramid.append((left <= x && x < right) ? "^" : " ");

            }

            piramid.append(System.getProperty("line.separator"));
        }
        return piramid.toString();
    }

}
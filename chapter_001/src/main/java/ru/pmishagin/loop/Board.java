package ru.pmishagin.loop;

/**
 *  Counter class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 25.10.2017
 */

public class Board {
    /**
     * @param width  ширина
     * @param height высота
     * @return доска.toString
     */
    public String paint(int width, int height) {

        StringBuilder board = new StringBuilder();

        for (int y = 0; y < height; y++) {

            for (int x = 0; x < width; x++) {
                board.append((x + y) % 2 == 1 ? "X" : " ");
            }
            board.append(System.getProperty("line.separator"));
        }
        return board.toString();
    }
}



package ru.pmishagin.contains;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 02.11.2017
 */
public class Contains {

    /**
     * Метод contain.
     * @param origin строка.
     * @param sub подстрока.
     * @return true или false.
     */

        public boolean contains(String origin, String sub) {

            boolean cont = false;

            char[] originChar = origin.toCharArray();

            char[] subChar = sub.toCharArray();

            for (int i = 0; i < (originChar.length - subChar.length); i++) {

                for (int j = 0; j < subChar.length; j++) {

                    if (subChar[j] == originChar[i + j]) {

                        cont = true;

                    } else {

                        cont = false;
                        break;
                    }
                }
                if (cont) break;
            }
            return cont;
        }


}

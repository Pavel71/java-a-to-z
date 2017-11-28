package ru.pmishagin.interfaces;

/**
 *  Input intrface.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.11.2017
 */
/**
 *
 *  Интерфейс Инпут(Определят то что должен делать каждый класс наследующий этот интерфейс)
 *
 */

public interface Input {


    String ask(String questeon);

    int ask(String qiesteon, int[] range);

}

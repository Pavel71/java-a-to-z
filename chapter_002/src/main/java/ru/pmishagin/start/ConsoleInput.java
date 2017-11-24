package ru.pmishagin.start;

import ru.pmishagin.interfaces.Input;

import java.util.*;

/**
 *  Input intrface.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.11.2017
 */
/**
 *
 *  Класс для реализации интерфейса(Ввод данных в консоль)
 *
 */

public class ConsoleInput implements Input {


    private Scanner scanner = new Scanner(System.in);

    /////////Переопределям метод интерфейса//////

    @Override
    public String ask(String question) {

        System.out.print(question);

        return scanner.nextLine();

    }


}

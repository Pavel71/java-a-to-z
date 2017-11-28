package ru.pmishagin.start;

import ru.pmishagin.interfaces.Input;

/**
 *  Input intrface.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.11.2017
 */
/**
 *
 *  Класс отвечает за вывод и сохранение информации
 *
 */
public class StubInput implements Input {

    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {

        this.answers = answers;
    }

    /////////Переопределям метод интерфейса//////

    @Override
    public String ask(String question) {

        return answers[position++];

    }
    public int ask(String question, int[] range) {

        return Integer.valueOf(this.ask(question));

        //throw new UnsupportedOperationException("Данная операция не поддерживается");
    }
}

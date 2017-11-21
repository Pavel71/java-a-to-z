package ru.pmishagin.start;

import ru.pmishagin.start.interfaces.Input;

/**
 *  Input intrface.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.11.2017
 */
/**
 *
 *
 *
 */
public class StubInput implements Input {

    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {

        this.answers = answers;
    }

    public String ask(String question) {

        return answers[position++];


    }
}

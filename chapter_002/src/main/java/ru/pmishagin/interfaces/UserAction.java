package ru.pmishagin.interfaces;

import ru.pmishagin.start.Tracker;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 24.11.2017
 */
public interface UserAction {

    int key();

    void execute(Input input, Tracker tracker);

    String info();


}

package ru.pmishagin.start;

import ru.pmishagin.interfaces.UserAction;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 29.11.2017
 */
abstract class BaseAction implements UserAction {

    private int key;

    private String name;

    /**
     *
     * Конструктор который избавляет от использования в каждом классе наследнике
     * повторяющихся методов int key() & String info()
     * @param key
     * @param name
     */

    public BaseAction(int key, String name) {

        this.key = key;
        this.name = name;

    }


    /**
     * Метод дающий общий доступ к переменой key
     * @return
     */

        public int key() {

        return this.key;
        }

    /**
     * Это абстрактный метод инфо который есть в каждом внутрренем классе
     * @return
     */

    public String info() {

        return String.format("%services.%services", this.key, this.name);
    }

}

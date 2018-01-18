package ru.pmishagin.collection.list;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 19.12.2017
 */

import java.util.Iterator;

/**
 * Реализуем сами аррей лист!
 */
public class MyListArray<E> implements ListContainer<E> {

    /**
     * Массив объектов
     */

    private Object[] container;

    /**
     * Индекс
     */

    private int index = 0;

    /**
     * Конструктор(Имплеменация)
     */

    public MyListArray() {

        this.container = new Object[10];
    }

    /**
     * Певый метод добавления в лист!
     */

    @Override

    public void add(E value) {

        if (checkSize()) {

         this.container[index++] = value;

        } else {

            createNewSize();

            container[index++] = value;
        }

    }

    /**
     * Метод возврата значенияя по индексу
     * @param index
     * @return
     */

    @Override

    public E get(int index) {

       return (E) container[index];
    }

    /**
     * Реализуем Итератор
     * @return
     */

    @Override
    public Iterator<E> iterator() {

        Iterator<E> it = new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < index && container[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) container[currentIndex++];
            }
        };
        return it;
    }

    /**
     * Меод Возвращает тру или фолс
     * Проверка на размер контейнера
     */

    private boolean checkSize() {

        boolean check = false;

        if (index < container.length - 1) {

            check = true;
        }
        return check;
    }

    /**
     * Метод создает контенер нового размера
     * типо динамическое расширение
     */

    private void createNewSize() {

        Object[] newObject = new Object[this.container.length * 2];

        System.arraycopy(newObject, 0, newObject, 0, container.length);

        this.container = newObject;
    }


}

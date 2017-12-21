package ru.pmishagin.set;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.12.2017
 */

import java.util.Iterator;

/**
 * Реализую Set  на массиве!Не должен хранить дубликаты
 * Метод Адд(Булевый) и метод Итератор
 */
public class SimpleSet<E> implements Iterable<E> {

    private Object[] objects;

    private int index = 0;

    /**
     * Создаем конструктор инициализирующий Set
     */


    public SimpleSet() {

        this.objects = new Object[2];
    }

    /**
     * Метод добавления в Set
     */

    public void add(E value) {

        if (checkSize()) {

            if (origin(value)) {

                objects[index++] = value;
            }

        } else {

            createNewSize();

            if (origin(value)) {

                objects[index++] = value;
            }

        }


    }

    /**
     * Переопределяем Итератор для сета
     */

    public Iterator<E> iterator() {

        Iterator<E> it = new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < index && objects[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) objects[currentIndex++];
            }
        };
        return it;
    }


    /**
     * Метод Проверяет объекты на оригинальность
     */

    public boolean origin(E value) {

        boolean res = true;

        for (Object element : objects) {

            if (value.equals(element)) {

                res = false;
                break;

            }

        }

        return res;
    }

    /**
     * метод проверяет есть ли место в массиве
     * @return
     */

    private boolean checkSize() {

        boolean check = false;

        if (index < objects.length - 1) {

            check = true;
        }
        return check;
    }


    /**
     * Метод создает контенер нового размера
     * типо динамическое расширение
     */

    private void createNewSize() {

        Object[] newObject = new Object[this.objects.length * 2];

        System.arraycopy(newObject, 0, newObject, 0, objects.length);

        this.objects = newObject;
    }




}

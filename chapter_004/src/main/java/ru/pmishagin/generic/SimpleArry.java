package ru.pmishagin.generic;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.12.2017
 */


/**
 * Класс симпл с неизвестным типом
 * @param <T>
 */

public class SimpleArry<T> {

    /**
     * Массив объектов
     */

    private Object[] objects;

    /**
     * Индекс массива
     */

    private int index = 0;

    /**
     * Конструктор класса
     * Инициализируем размер массива
     */

    public SimpleArry(int size) {

        this.objects = new Object[size];

    }

    /**
     * Метод по добавлению в массив
     */

    public void add(T values) {

        this.objects[index++] = values;
    }

    /**
     * Метод обновления в массиве
     */

    public void update(T values, int position) {

          this.objects[position] = values;
    }

    /**
     * Метод удаления из массива
     */

    public void delete(int position) {

        Object[] objectsNew = objects;

        int positionNew = position + 1;

        System.arraycopy(objectsNew, positionNew, objects, position, objects.length - (position + 1));
    }

    /**
     * Вызов значения по массиву
     */

    public T getindex(int position) {

        return (T) this.objects[position];
    }
}

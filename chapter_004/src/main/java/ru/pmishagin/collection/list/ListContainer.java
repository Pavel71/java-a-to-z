package ru.pmishagin.collection.list;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 19.12.2017
 */
public interface ListContainer<E> extends Iterable<E> {

    void add(E value);
    E get(int index);
    
}

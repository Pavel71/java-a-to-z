package ru.pmishagin.generic.store;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.12.2017
 */
public interface Store<T extends Base> {

    void add(T values);

    void update(int position, T value);

    void delete(int position);

    //T getIndex(int position);
}

package ru.pmishagin.iterator;

import java.util.Iterator;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.12.2017
 */
public class ConvertIterator implements Iterator<Integer> {

        /**
         * @param iteratorIterator - Итератор итераторов.
         */
        private Iterator<Iterator<Integer>> iteratorIterator;
        /**
         * @param iterator - Просто интежеры.
         */
        private Iterator<Integer> iterator;

        /**
         * Метод принимает Итраторы интеджеры и щелкает по итераторам(1й, 2ой, 3й итератор).
         * @param it - iterator with iterators.
         * @return this - this iteraor.
         */
        Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
            this.iteratorIterator = it;
            this.iterator = iteratorIterator.next();
            return this;
        }

        @Override
        public boolean hasNext() {
            boolean result = false;
            if (iterator.hasNext() || iteratorIterator.hasNext()) {
                result = true;
            }
            return result;
        }

        @Override
        public Integer next() {
            if (!iterator.hasNext() && iteratorIterator.hasNext()) {
                iterator = iteratorIterator.next();
            }
            return iterator.next();
        }
    }


package ru.pmishagin.collection.list;

import java.util.Iterator;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 20.12.2017
 */
public class MyLinkidList<E> implements ListContainer<E> {

    private int counter = 0;
    /**
     * @param head - head.
     */
    private Node head;
    /**
     * @param current - current.
     */
    private Node current;

    @Override
    public void add(E e) {
        if (head == null) {
            head = new Node(e);
        }

        Node temp = new Node(e);
        current = head;

        if (current != null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
        counter++;
    }

    @Override
    public E get(int index) {
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }
            return (E) current.getData();
        }
        return (E) current;
    }

    /**
     * Remove.
     * @param index - index.
     * @return true or false.
     */
    public boolean remove(int index) {

        if (index < 1 || index > counter) {
            return false;
        }

        Node current = head;

        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return false;
                }
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            counter--;
            return true;
        }
        return false;
    }

    /**
     * Get counter.
     * @return counter.
     */
    public int getCounter() {
        return counter;
    }


    @Override

    public Iterator<E> iterator() {

        Iterator<E> it = new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < counter;
            }

            @Override
            public E next() {
                currentIndex++;
                return (E) current.getData();
            }
        };
        return it;
    }

}

/**
 * Node.
 */
class Node {
    /**
     * @param next - next.
     */
    private Node next;
    /**
     * @param data - data.
     */
    private Object data;

    /**
     * Constructor.
     * @param dataVale - data value.
     */
    Node(Object dataVale) {
        next = null;
        data = dataVale;
    }

    /**
     * Get data.
     * @return - data.
     */
    public Object getData() {
        return  data;
    }

    /**
     * Get next.
     * @return - next.
     */
    public Node getNext()  {
        return next;
    }

    /**
     * Set next.
     * @param nextValue - next value.
     */
    public void setNext(Node nextValue) {
        next = nextValue;
    }
}

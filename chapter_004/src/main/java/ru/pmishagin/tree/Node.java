package ru.pmishagin.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 22.12.2017
 */
public class Node<E> {

    private final List<Node<E>> children = new ArrayList<>();
    private final E value;

    public Node(final E value) {
        this.value = value;
    }

    public void add(Node<E> child) {
        this.children.add(child);
    }

    public List<Node<E>> leaves() {

        return this.children;
    }

    public boolean eqValue(E that) {

        return this.value.equals(that);
    }
}

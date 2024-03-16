package ru.antipov.java_basic.homeworks.homework11;

import java.util.ArrayList;
import java.util.List;

public class Tree<T extends Comparable<T>> implements SearchTree<T> {
    private Node root;

    public Tree(List<T> list) {
        for (T element : list) {
            add(element);
        }
    }

    private void add(T element) {
        if (root == null) {
            root = new Node();
            root.value = element;
            return;
        }

        add(root, element);
    }

    private Node add(Node current, T element) {
        if (current == null) {
            current = new Node();
            current.value = element;
            return current;
        }

        if (current.value.compareTo(element) < 0) {
            current.right = add(current.right, element);
        } else if (current.value.compareTo(element) > 0) {
            current.left = add(current.left, element);
        }

        return current;
    }


    @Override
    public T find(T element) {
        return find(root, element);
    }

    private T find(Node current, T element) {
        if (current == null) {
            return null;
        }
        if (current.value.compareTo(element) == 0) {
            return current.value;
        } else if (current.value.compareTo(element) < 0) {
            return find(current.right, element);
        } else if (current.value.compareTo(element) > 0) {
            return find(current.left, element);
        }
        return null;
    }

    @Override
    public List<T> getSortedList() {
        List<T> elements = new ArrayList<>();
        pass(elements, root);

        return elements;
    }

    private void pass(List<T> elements, Node current) {
        if (current == null)
            return;

        pass(elements, current.left);

        elements.add(current.value);

        pass(elements, current.right);
    }

    private class Node {
        T value;
        Node left;
        Node right;
    }
}

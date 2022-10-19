package ru.averkiev.my_linked_list;

import java.util.LinkedList;

public class Node<T> {


    T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }


    Node<T> node(int index) {
        // assert isElementIndex(index);

        if (index < (MyLinkedList.size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = MyLinkedList.size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
}

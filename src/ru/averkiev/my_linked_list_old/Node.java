package ru.averkiev.my_linked_list_old;

/**
 * Класс элемента списка.
 */
public class Node<T> {
    private T t;                          // Хранимый объект. В нашем случае - Миньон.
    private Node<T> next;                              // Ссылка на следующий элемент списка.
    private Node<T> previous;                          // Ссылка на предыдущий элемент списка.

    public Node(T t, Node<T> next, Node<T> previous) {
        this.t = t;
        this.next = next;
        this.previous = previous;
    }

    public Node() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}

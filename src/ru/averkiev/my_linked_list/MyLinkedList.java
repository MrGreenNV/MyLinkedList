package ru.averkiev.my_linked_list;

public class MyLinkedList<T> implements MyList<T> {

    public static int size = 0;

    Node<T> first;

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    Node<T> last;
    @Override
    public void add(T t) {

    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public boolean update(T t1, T t2) {
        return false;
    }
}

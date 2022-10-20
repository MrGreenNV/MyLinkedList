package ru.averkiev.my_linked_list;

public class MyLinkedList<T> implements MyList<T> {

    Node<T> head;

    public static int size = 0;

    public static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;
        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void showList() {

        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }

        Node<T> currentNode = head;

        while (true) {
            System.out.println(currentNode.item.toString());
            if (currentNode.next == null) {
                return;
            }
            currentNode = currentNode.next;
        }
    }

    Node<T> search(int index) {
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode;
    }

    boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public void add(T element) {
        size++;

        if (head == null) {
            head = new Node<>(null, element, null);
            return;
        }

        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = new Node<>(currentNode, element, null);
    }

    @Override
    public boolean delete(int index) {

        if (!checkIndex(index)) {
            return false;
        }

        size--;

        if (head == null) {
            System.out.println("Список пуст!");
            return true;
        }

        Node<T> currentNode = search(index);

        // Удаление головы.
        if (currentNode == head) {
            head = currentNode.next;
            return true;
        }

        //Удаление хваоста.
        if (currentNode.next == null) {
            currentNode.prev.next = null;
            return true;
        }

        // Удаление элемента из середины.
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        return true;
    }

    @Override
    public boolean update(int index, T element) {
        if (!checkIndex(index)) {
            return false;
        }

        Node<T> currentElement = search(index);
        currentElement.item = element;

        return true;
    }

    @Override
    public T get(int index) {
        return search(index).item;
    }
}

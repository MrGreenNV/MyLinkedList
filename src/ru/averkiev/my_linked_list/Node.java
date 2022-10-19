package ru.averkiev.my_linked_list;

/**
 * Класс элемента списка.
 */
public class Node {
    private Minion minion;                          // Хранимый объект. В нашем случае - Миньон.
    private Node next;                              // Ссылка на следующий элемент списка.
    private Node previous;                          // Ссылка на предыдущий элемент списка.

    public Node(Minion minion, Node next, Node previous) {
        this.minion = minion;
        this.next = next;
        this.previous = previous;
    }

    public Node() {
    }

    public Minion getMinion() {
        return minion;
    }

    public void setMinion(Minion minion) {
        this.minion = minion;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}

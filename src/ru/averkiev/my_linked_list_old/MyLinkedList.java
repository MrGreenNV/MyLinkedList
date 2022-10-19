package ru.averkiev.my_linked_list_old;

import ru.averkiev.my_linked_list.Minion;

public class MyLinkedList<T> implements MyList<T> {
    public Node<T> head;

    public void showList() {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }

        Node<T> currentNode = head;

        while (true) {
//            System.out.println("{ id: " + currentNode.getT().getId() + "; name: " + currentNode.getT().getName() +
//                                "; patron: " + currentNode.getT().getPatron().getName() + " }");
            System.out.println(currentNode.getT().toString());
            if (currentNode.getNext() == null) {
                return;
            }
            currentNode = currentNode.getNext();
        }
    }

    public void add(T t) {
        if (head == null) {
            head = new Node<>(t, null, null);
            return;
        }

        Node<T> currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        Node<T> newNode = new Node<>(t, null, currentNode);
        currentNode.setNext(newNode);
    }

    public boolean delete(Object obj) {
        if (head == null) {
            System.out.println("Список пуст!");
            return false;
        }

        Node<T> currentNode = head;

        while (true) {
            if (currentNode.getT() == obj) {
                if (currentNode == head) {
                    head = currentNode.getNext();
                    return true;
                }

                if (currentNode.getNext() == null) {
                    currentNode.getPrevious().setNext(null);
                    return true;
                }

                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                return true;
            }

            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            } else {
                return false;
            }
        }
    }

    public boolean update(long id, String name, Villain patron) {
        if (head == null) {
            System.out.println("Список пуст!");
            return false;
        }

        Node<T> currentNode = head;

        while (true) {
            T r = currentNode.getT();

            if (currentNode.getT().getId() == id) {
                currentNode.getT().setName(name);
                currentNode.getT().setPatron(patron);
                return true;
            }

            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            } else {
                return false;
            }
        }
    }

    public boolean update(T t1, T t2) {
        if (head == null) {
            System.out.println("Список пуст!");
            return false;
        }

        Node<T> currentNode = head;

        while (true) {
            if (currentNode.getT() == t1) {
                currentNode.setT(t2);
                return true;
            }

            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            } else {
                return false;
            }
        }
    }

    public boolean update(long id, Villain patron) {
        if (head == null) {
            System.out.println("Список пуст!");
            return false;
        }

        Node<T> currentNode = head;

        while (true) {
            if (currentNode.getT().getId() == id) {
                currentNode.getT().setPatron(patron);
                return true;
            }

            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            } else {
                return false;
            }
        }
    }
}
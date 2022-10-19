package ru.averkiev.my_linked_list;

public class MyLinkedList {
    public static Node head;

    public void showList() {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }

        Node currentNode = head;

        while (true) {
            System.out.println("{ id: " + currentNode.getMinion().getId() + "; name: " + currentNode.getMinion().getName() +
                                "; patron: " + currentNode.getMinion().getPatron().getName() + " }");
            if (currentNode.getNext() == null) {
                return;
            }
            currentNode = currentNode.getNext();
        }
    }

    public void add(Minion minion) {
        if (head == null) {
            head = new Node(minion, null, null);
            return;
        }

        Node currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        Node newNode = new Node(minion, null, currentNode);
        currentNode.setNext(newNode);
    }

    public boolean delete(long id) {
        if (head == null) {
            System.out.println("Список пуст!");
            return false;
        }

        Node currentNode = head;

        while (true) {
            if (currentNode.getMinion().getId() == id) {
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

        Node currentNode = head;

        while (true) {
            if (currentNode.getMinion().getId() == id) {
                currentNode.getMinion().setName(name);
                currentNode.getMinion().setPatron(patron);
                return true;
            }

            if (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            } else {
                return false;
            }
        }
    }

    public boolean update(long id, String name) {
        if (head == null) {
            System.out.println("Список пуст!");
            return false;
        }

        Node currentNode = head;

        while (true) {
            if (currentNode.getMinion().getId() == id) {
                currentNode.getMinion().setName(name);
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

        Node currentNode = head;

        while (true) {
            if (currentNode.getMinion().getId() == id) {
                currentNode.getMinion().setPatron(patron);
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
package ru.averkiev.my_linked_list;

public class Minion {
    private static long count = 0;
    private long id;
    private String name;
    private Villain patron;

    public Minion(String name, Villain patron) {
        this.name = name;
        this.patron = patron;
        id = count++;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Villain getPatron() {
        return patron;
    }

    public void setPatron(Villain patron) {
        this.patron = patron;
    }
}

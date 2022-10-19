package ru.averkiev.my_linked_list_old;

public abstract class AbstractMinion {
    private static long count = 0;
    private long id;
    private String name;

    public AbstractMinion(String name) {
        this.name = name;
        this.id = count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }
}

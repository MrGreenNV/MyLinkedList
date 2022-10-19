package ru.averkiev.my_linked_list;

/**
 * Класс хранимого элемента, в данном случае - Миньон.
 */
public class Minion {
    private static long count = 0;      // Количество миньонов, прошедших через добавление в список.
    private long id;                    // ID минона.
    private String name;                // Имя миньона.
    private Villain patron;             // Злодей, покровительствующий над миньоном.

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

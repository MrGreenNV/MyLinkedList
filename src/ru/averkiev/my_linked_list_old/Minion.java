package ru.averkiev.my_linked_list_old;

/**
 * Класс хранимого элемента, в данном случае - Миньон.
 */
public class Minion extends AbstractMinion {
    private Villain patron;             // Злодей, покровительствующий над миньоном.

    public Minion(String name, Villain patron) {
        super(name);
        this.patron = patron;
    }

    public Villain getPatron() {
        return patron;
    }

    public void setPatron(Villain patron) {
        this.patron = patron;
    }

    @Override
    public String toString(){
        return "{ id: " + super.getId() + "; name: " + super.getName() +
                                "; patron: " + getPatron().getName() + " }";
    }
}

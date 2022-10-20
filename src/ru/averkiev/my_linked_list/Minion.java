package ru.averkiev.my_linked_list;

public class Minion {

    private String name;
    private int age;
    private String patron;

    public Minion(String name, int age, String patron) {
        this.name = name;
        this.age = age;
        this.patron = patron;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    @Override
    public String toString() {
        return "{ name: " + getName() + "; age: " + getAge() + "; patron: " + getPatron() + " }";
    }
}

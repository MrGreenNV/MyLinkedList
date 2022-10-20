package ru.averkiev.my_linked_list;

public interface MyList<T> {
    T get(int index);
    void add(T t);
    boolean delete(int index);
    boolean update(int index, T element);

}

package ru.averkiev.my_linked_list_old;

public interface MyList<T> {
    void add(T t);
    boolean delete(Object obj);
    boolean update(T t1, T t2);
}

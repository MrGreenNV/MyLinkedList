package ru.averkiev.my_linked_list;

public interface MyList<T> {

    void add(T t);
    boolean delete(T t);
    boolean update(T t1, T t2);

}

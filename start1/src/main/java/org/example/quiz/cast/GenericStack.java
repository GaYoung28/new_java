package org.example.quiz.cast;

import java.util.ArrayList;

public class GenericStack<T> {
    ArrayList<T> list = new ArrayList<>();

    public void push(T t){
        list.add(t);
    }

    public T pop(){
        return list.remove(list.size()-1);
    }

    public T peek(){
        return list.get(list.size()-1);
    }

    public ArrayList<T> getList() {
        return list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

package org.example.day15.제너릭;

public class Box<T> {

    private T i;

    public void setContent(T i) {
        this.i = i;
    }
    public T getContent() {
        return i;
    }
}

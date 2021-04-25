package com.company;

public class MyLindekList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLindekList() {
        size = 0;
    }
    public void add(T newItem, int index) {
        MyNode<T> newNode = new MyNode<>(newItem);
        if (head == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int find(T keyItem) {
        MyNode<T> current = head;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        return 0;
    }

    public void remove(int index) {

    }

    public void reverse() {

    }

    private static class MyNode<E> {
        E data;
        MyNode<E> next;

        MyNode(E data) {
            this.data = data;
        }
    }

    @Override
    public String toString() {
        return "MyLindekList{" +
                "head = " + head +
                ", tail = " + tail +
                ", size = " + size +
                '}';
    }
}

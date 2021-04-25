package com.company;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] arr;
    private int Size = 0;
    private int Cap = 5;

    public MyArrayList() {
        arr = new Object[Cap];
    }
    public void add(T newItem, int index) {
        if (Size == arr.length) {
            resize(2 * arr.length);
        }
        for (int i = Size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = newItem;
        Size++;
    }

    public int find(T keyItem) {
        for (int i = 0; i < Size; i++) {
            if (arr[i].equals(keyItem)) {
                return i;
            }
        }
        return -1;
    }

    public int remove(int index) {
        Object result = arr[index];
        for (int i = index; i < Size - 1; i++) {
            arr[index] = arr[index + 1];
        }
        Size--;
        arr[Size] = null;
        return (int) result;
    }

    public void reverse() {
        int temp;
        int start = 0;
        int end = Size - 1;
        while (start < end) {
            temp = (int) arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void resize(int Cap) {
        T[] newData = (T[]) new Object[Cap];
        for (int i = 0; i < Size; i++) {
            newData[i] = (T) arr[i];
        }
        arr = newData;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", Size = " + Size +
                ", Cap = " + Cap +
                '}';
    }
}

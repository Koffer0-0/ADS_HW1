package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        MyLindekList<Integer> link = new MyLindekList<Integer>();
        int size = 5;
        for (int i = 0; i < size; i++) {
            list.add(1 + i, i);
            link.add(2 + i, i);
        }
        System.out.println("Arraylist: " + list);
        System.out.println("LinkedList: " + link + '\n');

        System.out.println("You found:" + list.find(4));
        System.out.println("You found:" + link.find(3));

        list.reverse();
        link.reverse();
        System.out.println("After reversing:");
        System.out.println("Arraylist: " + list);
        System.out.println("LinkedList: " + link + '\n');

        System.out.println("Removed number: " + list.remove(2));
        System.out.println("Removed number: " + list.remove(2) + '\n');
        System.out.println("After removing");
        System.out.println("Arraylist: " + list);
        System.out.println("LinkedList: " + link + '\n');


    }

}



package ru.zhuravl;

import java.sql.SQLOutput;

public class LinkList implements InterfaceList{

    public class Node {
        String value;
        Node next;

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node tail;
    Node head;
    int size;

    LinkList() {
        initZero();
    }

    void initZero() {
        size = 0;
        this.tail = null;
        this.head = tail;
    }

    public void add(String data) {
        size++;
        Node node = new Node(data, null);
        if (tail == null) tail = node;
        else head.next = node;
        head = node;
    }


    public void removeHead() {
        Node ref = tail;
        for (int i = 0; i < size-2; i++) ref = ref.next;
        head = ref;
        head.next = null;
        size--;
    }


    public void printList() {
        Node ref = tail;
        for (int i = 0; i < size; i++) {
            System.out.printf("%s ",ref.value);
            ref = ref.next;
        }
    }

    public String[] getList() {
        Node ref = tail;
        String[] list = new String[size];

        for (int i = 0; i < size; i++) {
            list[i] = ref.value;
            ref = ref.next;
        }
        return list;
    }


    public String getNode(int index) {
        if (index > size-1) {
            System.out.println("ERROR!!! Your index is exceeds the max size of list !!!!!!!");
            return null;
        }
        Node node = tail;
        for (int i = 0; i < index; i++) node = node.next;
        return node.value;
    }


    @Override
    public int size() {
        return size;
    }





//=================================================================
    public void removeTail() {
        System.out.println();
        System.out.println();
    }

    public void removePosition(int position) {
        System.out.println();
        System.out.println();
    }



}

package ru.zhuravl;

import java.util.Arrays;

public class LinkList implements InterfaceList {

    public class Node implements InterfaceItem {
        String value;
        Node next;

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    private Node tail;
    private Node head;
    private int size;

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
        if (getTail() == null)
            tail = node;
        else
            getHead().next = node;
        head = node;
    }

    public void addList(InterfaceList list) {
        for (int i = 0; i < list.getSize(); i++) {
            size++;
            Node newNode = (Node) list.getNode(i);
            if (this.getTail() == null)
                this.tail = newNode;
            else
                this.head.next = newNode;
            this.head = newNode;
        }
    }

    public InterfaceList intersect(InterfaceList list) {
        InterfaceList list3 = new LinkList();

        for (int i = 0; i < this.getSize()-1; i++) {
            for (int j = 0; j < list.getSize()-1; j++) {
                if (this.getNodeValue(i) == list.getNodeValue(j)) list3.add(list.getNodeValue(j));
            }
        }
        return list3;
    }


    public InterfaceItem getNode(int index) {
        if (index > getSize()-1) {
            System.out.println("ERROR!!! Your index is exceeds the max size of list !!!!!!!");
            return null;
        }
        Node node = getTail();
        for (int i = 0; i < index; i++) node = node.next;
        return node;
    }


    public String getNodeValue(int index) {
        if (index > getSize()-1) {
            System.out.println("ERROR!!! Your index is exceeds the max size of list !!!!!!!");
            return null;
        }
        Node node = getTail();
        for (int i = 0; i < index; i++) node = node.next;
        return node.value;
    }


//==========================================================================================================

    public void removeHead() {
        Node ref = getTail();
        for (int i = 0; i < size-2; i++) ref = ref.next;
        head = ref;
        getHead().next = null;
        size--;
    }


    public void printList() {
        Node ref = getTail();
        for (int i = 0; i < getSize(); i++) {
            System.out.printf("%s ",ref.value);
            ref = ref.next;
        }
    }

    public String[] getListValues() {
        Node ref = getTail();
        String[] list = new String[getSize()];

        for (int i = 0; i < getSize(); i++) {
            list[i] = ref.value;
            ref = ref.next;
        }
        return list;
    }


}

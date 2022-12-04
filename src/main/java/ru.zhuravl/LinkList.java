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

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private Node tail;
    private Node head;
    private int size;

    LinkList() {
        initZero();
    }

    void initZero() {
        setSize(0);
        this.setTail(null);
        this.setHead(getTail());
    }

    public void add(String data) {
        setSize(getSize() + 1);
        Node node = new Node(data, null);
        if (getTail() == null) setTail(node);
        else getHead().next = node;
        setHead(node);
    }


    public void addList(InterfaceList list) {
        for (int i = 0; i < list.getSize(); i++) {
            setSize(getSize() + 1);
            Node newNode = (Node) list.getNode(i);
            if (this.getTail() == null) this.setTail(newNode);
            else this.getHead().next = newNode;
            this.setHead(newNode);
        }
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

    public InterfaceList intersect(InterfaceList list) {
        return list;
    }



    public void removeHead() {
        Node ref = getTail();
        for (int i = 0; i < size-2; i++) ref = ref.next;
        setHead(ref);
        getHead().next = null;
        setSize(getSize() - 1);
    }


    public void printList() {
        Node ref = getTail();
        for (int i = 0; i < getSize(); i++) {
            System.out.printf("%s ",ref.value);
            ref = ref.next;
        }
    }

    public String[] getList() {
        Node ref = getTail();
        String[] list = new String[getSize()];

        for (int i = 0; i < getSize(); i++) {
            list[i] = ref.value;
            ref = ref.next;
        }
        return list;
    }

}

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
        System.out.println("Begin: Create new list with 0 elements:");
        System.out.println("-----");
    }

    public void add(String data) {
        if (tail == null) {
            size++;
            Node nodeFirst = new Node(data, null);
            System.out.println("Add first node (nodeFirst) - " + nodeFirst.value);
            tail = nodeFirst;
            head = tail;
            System.out.println("-----");
            return;
        }
        size++;
        Node node = new Node(data, null);
        head.next = node;
        head = node;
        System.out.println("ADDED NEXT NODE - " + node.value);
        System.out.println("-----");
    }


    public void removeHead() {
        System.out.println("====== removeHead: =========================================");

        Node ref = tail;

        for (int i = 0; i < size-2; i++) {
            ref = ref.next;
        }
        head = ref;
        head.next = null;
        size--;
        System.out.println("We have removed HEAD:");
        System.out.printf("%-25s %-35s\n", " - New head is:", head);
        System.out.printf("%-25s %-35s\n", " - New head.value:", head.value);
        System.out.printf("%-25s %-35s\n", " - New head.next:", head.next);
        System.out.println("-----");
    }


    public void printList() {
        System.out.println("====== printList: =========================================");
        Node ref = tail;

        for (int i = 0; i < size; i++) {
            System.out.printf("%-4s : %s\n", i, ref.value);
            System.out.printf("%-15s %-35s\n", " - tail:", tail);
            System.out.printf("%-15s %-35s\n", " - tail.next:", tail.next);
            System.out.printf("%-15s %-35s\n", " - ref:", ref);
            System.out.printf("%-15s %-35s\n", " - ref.next:", ref.next);
            System.out.printf("%-15s %-35s\n", " - head:", head);
            System.out.println("-----");

            ref = ref.next;
        }
    }


    public String get(int index) {
        System.out.println("===== Get Node by position " + index + " ==========================");
        if (index > size-1) {
            System.out.println("ERROR!!! Your index is exceeds the max size of list !!!!!!!");
            return null;
        }

        Node node = tail;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        System.out.printf(" - %-15s %-35s %-10s %-10s\n", "The node value by index ", index, "is: ", node.value);
        System.out.printf(" - %-15s %-35s %-10s %-10s\n", "The node value by index ", index, "is: ", node.next);
        return node.value;
    }


    @Override
    public int size() {
        System.out.println("Size is: " + size);
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

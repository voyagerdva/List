package ru.zhuravl;

public class LinkList implements InterfaceList{

    public class Node {
        String value;
        Node previous;
        Node next;

//    Node(String value, Node previous) {
//        this.value = value;
//        this.previous = previous;
//    }

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    Node tail;
    Node currentNode;
    Node head;

    LinkList() {
        initZero();
    }

    void initZero() {
        this.tail = null;
        this.head = tail;
        System.out.println("Begin: Create new list with 0 elements:");
        System.out.println("-----");
    }


// !!! это рабочий метод. Работает "в обратную сторону". Попробую сделать чтоб работал прямо.
//    void add(String data) {
//        Node node = new Node(data, currentNode);
//        currentNode = node;
//        currentNode.position = position++;
//        System.out.println("    position = " + currentNode.position);
//    }

    public void add(String data) {
        if (tail == null && head == tail) {
            Node node = new Node(data, null);
            tail = node;
            head = node;
            currentNode = node;
            System.out.println("Add FIRST NODE - " + node.value);
            return;
        }
        currentNode = head;
        Node node = new Node(data, null);
        head = node;
        System.out.println("ADDED NEXT NODE - " + node.value);
    }



    public void printList() {
        Node ref = tail;
        while (ref != null) {
            System.out.printf("%s ", ref.value);
            ref = ref.previous;
        }
    }









    public void printAll() {
        Node ref = tail;
        while (ref != null) {
            System.out.printf("%s ", ref.value);
            ref = ref.previous;
        }
    }



    public void remove(int position) {
        System.out.println();
        System.out.println();
    }

    @Override
    public String get(int i) {
        System.out.println();
        return null;
    }

    @Override
    public int size() {
        System.out.println();
        return 0;
    }


}

package ru.zhuravl;

public class LinkList implements InterfaceList{
    public Node tail;
    public Node currentNode;
    public int position = 0;

//    public void LinkList(String data) {
//        this.tail = new Node(data, null);
//        this.tail.position = 0;
//        this.currentNode = tail;
//    }

    LinkList() {
        initZero();
    }

    public void initZero() {
        this.tail = null;
        this.currentNode = tail;
    }

    public void add(String data) {
        Node node = new Node(data, currentNode);
        currentNode = node;
        currentNode.position = position++;
        System.out.println("    position = " + currentNode.position);
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

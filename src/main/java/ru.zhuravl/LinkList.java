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
        if (getTail() == null)
            setTail(node);
        else
            getHead().next = node;
        setHead(node);
    }

    public InterfaceList intersectList(InterfaceList list) {
        LinkList list3 = new LinkList();

        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < list.getSize(); j++) {
                if (this.getNodeValue(i) == list.getNodeValue(j)){

                    Node node = (Node) list.getNode(j);

                    list3.setSize(list3.getSize() + 1);

                    if (list3.getTail() == null)
                        list3.setTail(node);
                    else
                        list3.getHead().next = node;
                    list3.setHead(node);

                    System.out.println(list3.getNodeValue(list3.getSize() - 1));
                }

            }
        }
        return list3;
    }

//    public InterfaceList intersectList(InterfaceList list) {
//        LinkList list3 = new LinkList();
//        Node ref1 = this.getTail();
//
//
//
//
//        do {
//            Node ref2 = ((LinkList) list).getTail();
//            do {
//                addEqNode(list3, ref1, ref2);
//
//                ref2 = ref2.next;
//            } while (ref2.next != null);
//
//            ref1 = ref1.next;
//        } while (ref1.next != null);
//
//
//
//
//
//        for (int i = 0; i < this.getSize(); i++) {
//            addEqNode(list3, (Node) this.getNode(i), (Node) ((LinkList) list).getHead());
//        }
//
//        for (int j = 0; j < list.getSize(); j++) {
//            addEqNode(list3, this.getHead(), (Node) ((LinkList) list).getNode(j));
//        }
//
//
//        return list3;
//
//    }

    private void addEqNode(LinkList list3, Node ref1, Node ref2) {
        if (ref1.value == ref2.value){

            Node node = ref1;

            list3.setSize(list3.getSize() + 1);

            if (list3.getTail() == null)
                list3.setTail(node);
            else
                list3.getHead().next = node;

            list3.setHead(node);
            System.out.print(list3.getNodeValue(list3.getSize() - 1) + " ");
        }
    }


    public void addList(InterfaceList list) {
        for (int i = 0; i < list.getSize(); i++) {
            setSize(getSize() + 1);
            Node newNode = (Node) list.getNode(i);
            if (this.getTail() == null)
                this.setTail(newNode);
            else
                this.getHead().next = newNode;
            this.setHead(newNode);
        }
    }


    public InterfaceList intersectValues(InterfaceList list) {
        InterfaceList list3 = new LinkList();

        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < list.getSize(); j++) {
                if (this.getNodeValue(i) == list.getNodeValue(j)) list3.add(list.getNodeValue(j));
            }
        }
        return list3;
    }



//   I HAVE TRIED TO REALIZED THIS WAY - IT WOS WRONG:
//
//    public InterfaceList intersect(InterfaceList list) {
//        InterfaceList list3 = new LinkList();
//
//        for (int i = 0; i < this.getSize(); i++) {
//            for (int j = 0; j < list.getSize(); j++) {
//                if (this.getNode(i).equals(list.getNode(j))) list3.add(list.getNodeValue(j));
//            }
//        }
//        return list;
//    }
//


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

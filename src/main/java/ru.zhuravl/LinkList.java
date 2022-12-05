package ru.zhuravl;

public class LinkList implements InterfaceList {

    public class Node implements InterfaceItem {
        String value;
        Node next;

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String getValue() {
            return value;
        }

        public InterfaceItem getItem() {
            return this;
        }
    }
//==============================================================================
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

    public InterfaceItem getNode(int index) {
        if (index > size-1) {
            System.out.println("ERROR!!! Your index exceeds the list max size !!!");
            return null;
        }
        InterfaceItem node = tail;
        for (int i = 0; i < index; i++)
            node = ((Node) node).next;
        return node;
    }


    public String getNodeValue(int index) {
        if (index > getSize()-1) {
            System.out.println("ERROR!!! Your index is exceeds the max size of list !!!!!!!");
            return null;
        }
        Node node = tail;
        for (int i = 0; i < index; i++)
            node = node.next;
        return node.getValue();
    }

    public void add(String data) {
        size++;
        Node node = new Node(data, null);
        if (tail == null)
            tail = node;
        else
            head.next = node;
        head = node;
    }

    public void addList(LinkList list) {
        for (int i = 0; i < list.getSize(); i++) {
            size++;
            Node node = (Node) list.getNode(i);
            if (this.tail == null)
                this.tail = node;
            else
                this.head.next = node;
            this.head = node;
        }
    }

    public InterfaceList intersect(LinkList list) {
        InterfaceList list3 = new LinkList();

        for (int i = 0; i < this.size-1; i++) {
            for (int j = 0; j < list.size-1; j++)
                if (this.getNodeValue(i) == (list).getNodeValue(j))
                    list3.add(list.getNodeValue(j));
        }
        return list3;
    }



//==========================================================================================================

    public void removeHead() {
        Node ref = tail;
        for (int i = 0; i < size-2; i++)
            ref = ref.next;
        head = ref;
        head.next = null;
        size--;
    }


    public void printList() {
        Node ref = tail;
        for (int i = 0; i < getSize(); i++) {
            System.out.printf("%s ",ref.value);
            ref = ref.next;
        }
    }

    public String[] getListValues() {
        Node ref = tail;
        String[] list = new String[getSize()];

        for (int i = 0; i < size; i++) {
            list[i] = ref.getValue();
            ref = ref.next;
        }
        return list;
    }


}

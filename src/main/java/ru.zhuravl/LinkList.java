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

        @Override
        public InterfaceItem getNext() {
            return next;
        }
    }
//==============================================================================

    private InterfaceItem tail;
    private InterfaceItem head;
    private int size;

    public int getSize() {
        return size;
    }

    public InterfaceItem getTail() {
        return tail;
    }

    public InterfaceItem getHead() {
        return head;
    }

    LinkList() {
        initZero();
    }

    void initZero() {
        size = 0;
        this.tail = null;
        this.head = tail;
    }


//=================================================================================
    public void add(String data) {
        size++;
        InterfaceItem node = createNode(data);
        if (tail == null) {
            tail = node;
        } else {
            ((Node) head).next = (Node) node;
        }
        head = node;
    }

    protected InterfaceItem createNode(String data) {
        return new Node(data, null);
    }

    public InterfaceList intersect(LinkList list) {
        InterfaceList list3 = createList();

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < list.size; j++) {
                if (this.getElement(i).equals((list).getElement(j))) {
                    list3.add(list.getElement(j));
                }
            }
        }
        return list3;
    }

    public String getElement(int index) {
        if (index > size - 1) {
            System.out.println("ERROR!!! Too big index!!!");
            return null;
        }
        InterfaceItem node = tail;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    public void addList(LinkList list) {
        for (int i = 0; i < list.getSize(); i++) {
            size++;
            Node node = (Node) list.getNode(i);
            if (this.tail == null)
                this.tail = node;
            else
                ((Node) this.head).next = node;
            this.head = node;
        }
    }

    InterfaceItem getNode(int index) {
        if (index > size - 1) {
            System.out.println("ERROR!!! Your index exceeds the list max size !!! The last head node is :");
            return getHead();
        }
        InterfaceItem node = tail;
        for (int i = 0; i < index; i++)
            node = ((Node) node).next;
        return node;
    }

    protected InterfaceList createList() {
        return new LinkList();
    }

    @Override
    public void printList() {
        InterfaceItem ref = tail;
        for (int i = 0; i < getSize(); i++) {
            System.out.printf("%s ", ref.getValue());
            ref = ref.getNext();
        }
        System.out.println();
    }

    public void removeHead() {
        InterfaceItem ref = tail;
        for (int i = 0; i < size - 2; i++)
            ref = ref.getNext();
        head = ref;
        ((Node) head).next = null;
        size--;
    }

    @Override
    public String[] getListValues() {
        InterfaceItem ref = tail;
        String[] list = new String[getSize()];

        for (int i = 0; i < size; i++) {
            list[i] = ref.getValue();
            ref = ref.getNext();
        }
        return list;
    }



//=================================================================================

    @Override
    public void removeElement(int index) {
        InterfaceItem ref = tail;

        if (index == 0) {
            tail = ref.getNext();
            size--;
            return;
        }

        if (index == size - 1) {
            removeHead();
            return;
        }

        for (int i = 0; i < index - 1; i++)
            ref = ref.getNext();

        refNextNext(ref);
        size--;
    }

    private Node refNextNext(InterfaceItem ref) {
        ((Node) ref).next = (Node) ref.getNext().getNext();
        return ((Node) ref).next;
    }

}


























package ru.zhuravl;

public class LinkListA implements InterfaceListA {
    public class NodeA implements InterfaceItemA {
        ObjectA value;
        NodeA next;

        NodeA(ObjectA value, LinkListA.NodeA next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public ObjectA getValue() {
            return value;
        }

        @Override
        public String getName() {
            return value.name;
        }

        @Override
        public InterfaceItemA getNext() {
            return this.next;
        }
    }
//==============================================================================

    private InterfaceItemA tail;
    private InterfaceItemA head;
    private int size;

    @Override
    public int getSize() {
        return size;
    }

    public InterfaceItemA getTail() {
        return tail;
    }

    public InterfaceItemA getHead() {
        return head;
    }

    LinkListA() {
        initZero();
    }

    void initZero() {
        size = 0;
        this.tail = null;
        this.head = tail;
    }

    //==============================================================================
    @Override
    public void add(ObjectA data) {
        size++;
        InterfaceItemA node = createNode(data);
        if (tail == null) {
            tail = node;
        } else {
            ((NodeA) head).next = (NodeA) node;
        }
        head = node;
    }

    protected InterfaceItemA createNode(ObjectA data) {
        return new NodeA(data, null);
    }

    @Override
    public InterfaceListA intersect(LinkListA list) {
        InterfaceListA list3 = createList();

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < list.size; j++) {
                if (this.getElement(i).equals((list).getElement(j))) {
                    list3.add(list.getElement(j));
                }
            }
        }
        return list3;
    }

    @Override
    public ObjectA getElement(int index) {
        if (index > size - 1) {
            System.out.println("ERROR!!! Too big index (LinkListA)!!!");
            return null;
        }
        InterfaceItemA node = tail;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    @Override
    public void addList(LinkListA list) {
        for (int i = 0; i < list.getSize(); i++) {
            size++;
            NodeA node = (NodeA) list.getNode(i);
            if (this.tail == null) {
                this.tail = node;
            } else {
                ((NodeA) this.head).next = node;
            }
            this.head = node;
        }
    }

    InterfaceItemA getNode(int index) {
        if (index > size - 1) {
            System.out.println("ERROR!!! Your index exceeds the list max size !!! The last head node is :");
            return getHead();
        }
        InterfaceItemA node = tail;
        for (int i = 0; i < index; i++)
            node = ((LinkListA.NodeA) node).next;
        return node;
    }

    protected InterfaceListA createList() {
        return new LinkListA();
    }

    @Override
    public void printObjectsList() {
        InterfaceItemA ref = tail;
        for (int i = 0; i < getSize(); i++) {
            System.out.printf("%-28s : %s\n", ref.getValue(), ref.getName());
            ref = ref.getNext();
        }
        System.out.println();
    }

    @Override
    public void removeHead() {
        InterfaceItemA ref = tail;
        for (int i = 0; i < size - 2; i++) {
            ref = ref.getNext();
        }
        head = ref;
        ((NodeA) head).next = null;
        size--;
    }

    @Override
    public String[] getListValuesNames() {
        InterfaceItemA ref = tail;
        String[] list = new String[size];

        for (int i = 0; i < size; i++) {
            list[i] = ref.getValue().name;
            ref = ref.getNext();
        }
        return list;
    }

//==============================================================================


    @Override
    public void removeElement(int index) {
        InterfaceItemA ref = tail;

        if (size == 0) {
            System.out.println("ERROR!!! The list is EMPTY!!!");
            return;
        }

        if (index > size - 1) {
            System.out.println("ERROR!!! Too big index!!!");
            return;
        }

        if (index == 0) {
            tail = ref.getNext();
            size--;
            return;
        }

        if (index == size - 1) {
            removeHead();
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            ref = ref.getNext();
        }

        refNextNext(ref);
        size--;
    }

    private NodeA refNextNext(InterfaceItemA ref) {
        ((NodeA) ref).next = (NodeA) ref.getNext().getNext();
        return ((NodeA) ref).next;
    }
}






















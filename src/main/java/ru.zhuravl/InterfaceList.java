package ru.zhuravl;

public interface InterfaceList {

    void add(String data);

    void printList();
    String[] getList();
    String getNodeValue(int index);
    InterfaceItem getNode(int index);

    public void addList(InterfaceList list);

    public InterfaceList intersect(InterfaceList list);

    void removeHead();

    int getSize();




//    Node addFirst();
//
//    void printFirst(Node obj);
}

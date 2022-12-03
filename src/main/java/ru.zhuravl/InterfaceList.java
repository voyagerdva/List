package ru.zhuravl;

public interface InterfaceList {

    void add(String data);

    void printList();
    String[] getList();
    String getNodeValue(int index);
    LinkList.Node getNode(int index);

    public void addList(InterfaceList list);

    public InterfaceList intersect(InterfaceList list);

    void removeHead();
    void removeTail();
    void removePosition(int position);



    int size();



//    Node addFirst();
//
//    void printFirst(Node obj);
}

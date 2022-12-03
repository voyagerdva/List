package ru.zhuravl;

public interface InterfaceList {

    void add(String data);

    void printList();
    String[] getList();
    String getNode(int index);

    void removeHead();
    void removeTail();
    void removePosition(int position);



    int size();



//    Node addFirst();
//
//    void printFirst(Node obj);
}

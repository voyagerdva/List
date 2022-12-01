package ru.zhuravl;

public interface InterfaceList {

    void add(String data);

    void printList();

    void removeHead();
    void removeTail();
    void removePosition(int position);

    String get(int index);

    int size();



//    Node addFirst();
//
//    void printFirst(Node obj);
}

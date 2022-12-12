package ru.zhuravl;

public interface InterfaceList {

    InterfaceList intersect(LinkList list);
    String[] getListValues();

    void add(String data);
    void printList();
    void addList(LinkList list);
    void removeHead();
    void removeElement(int index);
    String getElement(int index);
    int getSize();

}

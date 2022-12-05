package ru.zhuravl;

public interface InterfaceList {

    void add(String data);

    void printList();

    String[] getListValues();

    public void addList(LinkList list);

    public InterfaceList intersect(LinkList list);

    void removeHead();

    int getSize();

}

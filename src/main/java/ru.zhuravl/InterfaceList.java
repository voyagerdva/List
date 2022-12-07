package ru.zhuravl;

public interface InterfaceList {

    void addFront(String data);

    void printList();

    String[] getListValues();

    public void addList(LinkList list);

    public InterfaceList intersect(LinkList list);

    void removeHead();

    void removeElement(int index);

    String getElement(int index);

    int getSize();

}

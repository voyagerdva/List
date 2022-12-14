package ru.zhuravl;

public interface InterfaceListA {
    InterfaceListA intersect(LinkListA list);
    String[] getListValuesNames();
    void add(ObjectA data);
    void printObjectsList();
    void addList(LinkListA list);
    void removeHead();
    void removeElement(int index);
    ObjectA getElement(int index);
    int getSize();

}

package ru.zhuravl;

public class List implements InterfaceList{
    public void add(String item) {
        System.out.println("\nThis is Lib-method public void add(String item)");
        System.out.println();
    }

    public void remove(int position) {
        System.out.println();
        System.out.println();
    }

    @Override
    public String get(int i) {
        System.out.println();
        return null;
    }

    @Override
    public int size() {
        System.out.println();
        return 0;
    }
}

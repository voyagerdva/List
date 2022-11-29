package ru.zhuravl;

public class List {

    byte[] createNewList(byte size) {
        return new byte[size];
    }

    public void push(String[] arr, String item) {
        System.out.println("This is method public void push(String item)");
    }

    public void delete(int position) {
        System.out.println("This is method public void delete(int position)");
    }

    public String take() {
        return "This is method public String take()";
    }

    public void printAll() {
        System.out.println("This is method public void printAll()");
    }

    public void clean() {
        System.out.println("This is method public void clean()");
    }


}

package ru.zhuravl;

public class List implements InterfaceList{

    byte[] createNewList(byte size) {
        return new byte[size];
    }

    public void add(String[] arr, String item) {
        System.out.println("This is method public void push(String item)");
        System.out.println();
    }

    public void remove(int position) {
        System.out.println("This is method public void delete(int position)");
        System.out.println();
    }

    public void show() {
        System.out.println("This is method public void printAll()");
        System.out.println();
    }

//    public String take() {
//        return "This is method public String take()";
//    }


//    public void clean() {
//        System.out.println("This is method public void clean()");
//    }


}

package ru.zhuravl;

public class ObjectA {
    String name;

    ObjectA(String name) {
        this.name = name;
    }

//    @Override
    public boolean equals(ObjectA objectA) {
        return this.name == objectA.name;
    }
}

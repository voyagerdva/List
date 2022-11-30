package ru.zhuravl;

public class Node {
    String value;
    Node previous;
    int position = 0;

    Node(String value, Node previous) {
        this.value = value;
        this.previous = previous;
    }
}

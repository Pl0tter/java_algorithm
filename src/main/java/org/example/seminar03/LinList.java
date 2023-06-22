package org.example.seminar03;

public class LinList {

    private Node head;

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removeFirst() {
        if (head == null) System.out.println("Нельзя удалить элемент из пустого списка");
        else head = head.next;
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) head = node;
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    public void removeLast() {
        if (head == null) System.out.println("Нельзя удалить элемент из пустого списка");
        else {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }

    public boolean contains(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) return true;
            node = node.next;
        }
        return false;
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) head = currentNode;
        else revert(currentNode.next, currentNode);
        currentNode.next = previousNode;
    }

    public void print() {
        if (head == null) System.out.println("Список пуст");
        else {
            Node node = head;
            while (node != null) {
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            System.out.println();
        }
    }

    private class Node {
        private int value;
        private Node next;
    }
}

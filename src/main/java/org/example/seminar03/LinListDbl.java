package org.example.seminar03;

/**
 * Реализовать методы для двухсвязного списка (добавление первого/последнего, удаление первого/последнего, вывод, метод разворота)
 */
public class LinListDbl {
    Node head;
    Node tail;

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
            head.previous = node;
        } else tail = node;
        head = node;
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            tail.next = node;
            node.previous = tail;
        } else head = node;
        tail = node;
    }

    public void deleteFirst() {
        if (head != null) {
            if (head.next != null) {
                head.next.previous = null;
                head = head.next;
            } else {
                head = null;
                tail = null;
            }
        } else System.out.println("Список пустой");
    }

    public void deleteLast() {
        if (tail != null) {
            if (tail.previous != null) {
                tail.previous.next = null;
                tail = tail.previous;
            } else {
                head = null;
                tail = null;
            }
        } else System.out.println("Список пустой");
    }

    public void print() {
        if (head == null) System.out.println("Список пуст");
        else {
            Node node = head;
            while (node != null) {
                System.out.print(node.value);
                if (node.next != null) System.out.print(" <-> ");
                node = node.next;
            }
            System.out.println();
        }
    }

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) tail = currentNode;
            if (next == null) head = currentNode;
            currentNode = next;
        }
    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }
}
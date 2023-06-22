package org.example.lecture03;

public class SinglyLinkedList {
    Node head;

    //
//    public Node find(int value) {
//        Node currentNode = head;
//        while (currentNode != null) {
//            if (currentNode.value == value) return currentNode;
//            currentNode = currentNode.next;
//        }
//        return null;
//    }
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else revert(currentNode.next, currentNode);
        currentNode.next = previousNode;
//        previousNode.next = null;
    }

    public class Node {
        int value;
        Node next;
    }

}












package org.example.seminar03;

public class Main {
    public static void main(String[] args) {
        LinList list = new LinList();
        list.removeFirst();
        list.removeLast();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.removeFirst();
        list.addLast(0);
        list.addLast(-1);
        list.addLast(-2);
        list.removeLast();
        list.print();
        list.revert();
        list.print();
        System.out.println(list.contains(0));

        System.out.println("\nДвухсвязный список");
        LinListDbl listDbl = new LinListDbl();
        listDbl.deleteFirst();
        listDbl.deleteLast();
        listDbl.addFirst(5);
        listDbl.addFirst(4);
        listDbl.addLast(6);
        listDbl.print();
        listDbl.revert();
        listDbl.print();
        listDbl.deleteFirst();
        listDbl.deleteLast();
        listDbl.print();
    }
}


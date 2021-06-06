package com.allever.datasturct.linklist;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int len = 0;


    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.show();

        linkedList.remove(4);
        linkedList.show();
        int size = linkedList.size();
        System.out.println("size = " + size);

        LinkedList<String> linkedListString = new LinkedList<>();
        linkedListString.add("Amy");
        linkedListString.add("Bate");
        linkedListString.add("Cristy");
        linkedListString.add("David");
        linkedListString.show();
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        len++;
    }

    //index = 0
    //A->B->C->D
    public void add(T data, int index) {
        if (index < 0 || index > len) {
            return;
        }
        
        Node<T> target = head;

        for (int i = 0; i < index; i++) {
            target = target.next;
        }

        if (index == 0) {

        } else if (index == len) {

        } else {

        }


//        len ++;

    }

//    public T get(int index) {
//
//    }

    public int size() {
        return len;
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }

        Node<T> target = head;
        Node<T> pre = null;
        while (target != null) {
            if (target.data.equals(data)) {

                if (pre == null) {
                    head = null;
                    tail = null;
                } else {
                    System.out.println("target = " + target.data);
                    pre.next = target.next;
                    target = null;
                }
                len--;
                break;
            }
            pre = target;
            target = target.next;
        }


    }

    public void show() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data);
            if (p.next != null) {
                System.out.print("->");
            } else {
                System.out.print("\n");
            }
            p = p.next;
        }
    }

    private static class Node<T> {
        Node<T> next;
        T data;
        public Node(T data) {
            this.data = data;
        }
    }
}

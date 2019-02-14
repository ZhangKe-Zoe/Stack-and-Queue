/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author myego
 */
public class LinkedList<E> implements ILinkedList<E> {

    public class Node {

        public E value;
        public Node next = null;

        public Node(E value) {
            this.value = value;
        }
    }
    public Node head;

    
    @Override
    public void add(E value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node iterator = head; 
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = new Node(value);
        }
    }

    @Override
    public void print() {
        if (head != null) {
            Node iterator = head; // Call by Reference!
            while (iterator != null) {
                System.out.println(iterator.value + " ");
                iterator = iterator.next;
            }
        }
    }

    @Override
    public E get(int index) {
        Node iterator = head;
        int counter = 0;
        while (iterator != null) {
            if (counter == index) {
              return iterator.value;
            }
            counter++;
            iterator = iterator.next;
        }
        return null;
    }
}

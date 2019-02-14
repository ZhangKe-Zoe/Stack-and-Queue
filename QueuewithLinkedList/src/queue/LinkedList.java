/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author myego
 */
public class LinkedList implements ILinkedList {

    public class Node {

        public int value;
        public Node next = null;

        public Node(int value) {
            this.value = value;
        }
    }
    public Node head;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node iterator = head; // Call by Reference!
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = new Node(value);
        }
    }

    //dequeue
    public int remove() throws Exception{
        int item;
        if (head.next != null) {
            item = head.value;
            head = head.next; 
            return item;
        }
        else throw new Exception("The queue is empty");
    }

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
    public int get(int index) {
        int x = 0;
        
        Node iterator = head;
        int counter = 0;
        while (iterator != null) {            
            
            if (counter == index) {      
                x = iterator.value;
            }
                counter++;
                iterator = iterator.next;           
            
        }
        return  x;
    }

    public int size() {

        Node iterator = head;
        int counter = 0;
        while (iterator != null) {
            iterator = iterator.next;
            counter++;
        }

        return counter;
    }

}

package gr.aueb.cf.ch19;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class DoublyLinkedList<T> {
    private NodeGeneric<T> head;
    private NodeGeneric<T> tail;

    public DoublyLinkedList() {
            head = tail = null; // not necessary to state it as tail and head are already nulls
    }

    /**
     * Time Complexity -> O(1)
     * @param t
     */
    public void insertFront(T t) {
        NodeGeneric<T> tmp = new NodeGeneric<>();
        tmp.setValue(t);
        tmp.setPrev(null);
        tmp.setNext(head);

        head = tmp;

        if (tmp.getNext() == null) {
            tail = tmp;
        } else {
            tmp.getNext().setPrev(tmp);
        }
    }

    /**
     * Time Complexity -> O(1)
     * @param t
     */
    public void insertEnd(T t) {
        NodeGeneric<T> tmp = new NodeGeneric<>();
        tmp.setValue(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail = tmp;

        if (tmp.getPrev() == null) {
            head = tmp;
        } else {
            tmp.getPrev().setNext(tmp);
        }
    }

    /**
     * Time Complexity -> O(1)
     */
    public void deleteFront() {
        if (isEmpty()) return;
        // if only one element in the list
        if (head.getNext() == null) {
            head = tail = null;
        } else { // more than one elements in the list
            head = head.getNext();
            head.setPrev(null);
        }
    }

    /**
     * Time Complexity -> O(1)
     */
    public void deleteEnd() {
        if (isEmpty()) return;
        // if (head.getNext() == null) {
        if (tail.getPrev() == null) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    /**
     * Time Complexity -> O(n)
     * @param t
     * @return
     */
    public NodeGeneric<T> get(T t) {
        for (NodeGeneric<T> n = head; n != null; n = n.getNext()) {
            if (n.getValue().equals(t)) {
                return n;
            }
        }
        return null;
    }

    public void traverse() {
        for (NodeGeneric<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n); // toString should have been overridden into NodeGeneric<T> class
        }
    }

    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }
}

package com.andrew.stack.stackWithLinkedList;

class LinkedList {
   Node head;
   Node tail;
   int size;

   Node createLinkedList(int nodeValue) {
       head = new Node();
       Node node = new Node();
       node.next = null;
       node.value = nodeValue;
       head = node;
       tail = node;
       size = 1;
       return head;
   }

   // Insert Method SinglyLinkedList
    void insertInLinkedList (int nodeValue, int location) {
       Node node = new Node();
       node.value = nodeValue;
       if (head == null) {
           createLinkedList(nodeValue);
           return;
       } else if (location == 0) {
           node.next = head;
           head = node;
       } else if(location >= size) {
           node.next = null;
           tail.next = node;
           tail = node;
       } else {
           Node tempNode = head;
           int index = 0;
           while (index < location - 1) {
               tempNode = tempNode.next;
               index++;
           }
           Node nextNode = tempNode.next;
           tempNode.next = node;
           node.next = nextNode;
       }
       size++;
    }

    // SinglyLinkedList Traversal
    void traverseSinglyLinkedList() {
       if (head == null) {
           System.out.println("SLL does not exist");
       } else {
           Node tempNode = head;
           for (int i = 0; i < size; i++) {
               System.out.print(tempNode.value);
               if (i != size) {
                   System.out.print(" -> ");
               }
               tempNode = tempNode.next;
           }
       }
        System.out.println("\n");
    }

    //

}
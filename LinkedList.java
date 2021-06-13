/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 13.06.21
 *
 * purpose: is to create a linked list and perform different operations
 * insertion deletion.
 *
 */
package com.bridgelabz.datastructure;

class LinkedList {

    //starting node
    private Node head;

    /**
     * UC1: Method for inserting data into linked list.
     *
     * @param data Here we first check that our node is empty or not if its
     * empty then add data and make it as a head of node. If the head node is
     * not empty then it check for next node if its empty then add the data
     * there otherwise loops will continue.
     *
     */
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node newNode = head;
            while (newNode.next != null) {
                newNode = newNode.next;
            }
            newNode.next = node;
        }
    }
    
   /**
    * UC10: Method for sorting linked list into ascending order list.
    * 
    */

    public void sortList() {
        Node current = head, index = null;
        int temp;

        if (head == null) {
        } else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if ((current.data) > (index.data)) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
        /**
         * UC-2 traversing this list and printing the node value
         *
         */ 
	 
    public void showList() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}

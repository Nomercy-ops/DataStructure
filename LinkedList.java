/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 13.06.21
 *
 * purpose: is to create a linked list and perform different operations insertion deletion.
 *
 */

package com.bridgelabz.datastructure;

 class LinkedList<T> {

    //starting node
   private Node<T> head;
/**
    * UC1: Method for inserting data into linked list.
    * @param data 
    * Here we first check that our node is empty or not if its empty then add data and make it as a head of node.
    * If the head node is not empty then it check for next node if its empty then add the data there otherwise loops will continue. 
	*
    */
	
   public void insert( T data) {
        Node<T> node = new Node(data);
        node.setData(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> newNode = head;
            while (newNode.getNext()!= null) {
                newNode = newNode.getNext();
            }
           newNode.setNext(node);
        }
    }
	
   /**
     * UC4: here by taking index value we are inserting data in between two
     * number.
     *
     * @param index
     * @param data
     */
	 
    public void insertBetween(int index, T data) {
        Node<T> node = new Node(data);
        node.setData(data);

        if (index == 0) {
            insert(data);
        } else {
            Node<T> newNode = head;
            for (int i = 0; i < index - 1; i++) {
                newNode = newNode.getNext();
            }
            node.setNext(newNode.getNext());
            newNode.setNext(node);

        }
    }
	
	
  /**
     * uc5: method for removing first element of linkedlist..
     *
     */
    public void deleteFirstElement() {

        if (head.getNext() != null) {
            head = head.getNext();
        } else {
            head = null;
        }

    }
	
	
/**
 * UC-2  traversing this list and printing the node value
 * 
 */ 
	 
    public void showList() {
    Node<T> node = head;
     while (node.getNext() != null) {
      System.out.println(node.getData());
      node = node.getNext();
     }
    System.out.println(node.getData());
    }
   
}
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
    * 
    */
   public void insert( T data) {
        Node<T> node = new Node(data);
        node.setData(data);
        head = node; 
    }
}

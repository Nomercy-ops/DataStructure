package com.bridgelabz.datastructure;

/**
 * 
 *  This is a node class and it is used to create the individual data holding blocks for linked list.
 *  Though it can hold any kind of data like,Integer ,String,etc. 
 *  
 */ 

public class Node {

   //Storing value of node
    int data;
   // Storing address of next node
     Node next;
  

 /**
   * Parameterized constructor to assign value
   * getter and setter methods.
   * @param data
   */ 

    public Node(int data) {
        this.data = data;
        this.next = null;
        
    }
    
  }

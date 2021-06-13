package com.bridgelabz.datastructure;

/**
 * 
 *  This is a node class and it is used to create the individual data holding blocks for linked list.
 *  Though it can hold any kind of data like,Integer ,String,etc. 
 *  @param <T> 
 */ 

public class Node<T> {

   //Storing value of node
    private  T data;
   // Storing address of next node
    private Node<T> next;

 /**
   * Parameterized constructor to assign value
   * getter and setter methods.
   * @param data
   */ 

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    
  }

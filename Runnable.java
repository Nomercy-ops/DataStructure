package com.bridgelabz.datastructure;


/**
 * This Runnable class have the main method for inserting removing and showing data of linked list.
 * here we pass integer number by creating constructor of linked list to do different operations.
 * 
 * 
 */

public class Runnable {

    public static void main(String[] args) {
       
        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(30);
        list.insert(70);
        list.showList();
        list.sortList();
        list.showList();
        
    }
}


package com.bridgelabz.datastructure;


/**
 * This Runnable class have the main method for inserting removing and showing data of linked list.
 * here we pass integer number by creating constructor of linked list to do different operations.
 * UC-3 inserting number 56 ,30,70
 *
 */

public class Runnable {

    public static void main(String[] args) {
       
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(56);
        list.insert(30);
        list.insert(70);
        list.showList();
    }
}


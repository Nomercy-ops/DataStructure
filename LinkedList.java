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
   * uc5: method for removing number or data by putting index value.
   * @param index 
   */  
 
    public void pop(int index) {
     if (index == 0) {
       head = head.getNext();
     } else {
       Node<T> node = head;
       Node<T> newNode;
       for (int i = 0; i < index - 1; i++) {
        node = node.getNext();
       }
        newNode = node.getNext();
        node.setNext(newNode.getNext());
     }
  
   }
   
   /**
     * uc6: method for removing last element of linked list.
     *
     */
    public void deleteLastElement() {

        if (head == null) {
            System.out.println("List is empty..");
        }
        if (head.getNext() == null) {
            System.out.println("There is no other element in list");
        }
        // Find the second last node
        Node<T> secondLast = head;
        while (secondLast.getNext().getNext() != null) {
            secondLast = secondLast.getNext();
        }

        // Change next of second last
           secondLast.setNext(null);
    }
	
	/**
     * @param data - uc7 elements to be searched in the list
     * @returns position  of the element if it id present  in the list.
     */
   
    public void searchList(T data) {
          Node<T> current = head;  
        int i = 1;  
        boolean flag = false;  
        //Checks whether list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                 //Compares node to be found with each node present in the list  
                if(current.getData() == data) {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.getNext();  
            }  
        }  
        if(flag)  
             System.out.println("Element is present in the list at the position : " + i);  
        else  
             System.out.println("Element is not present in the list");  
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
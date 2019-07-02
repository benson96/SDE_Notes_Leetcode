import java.io.*;

// Java program to implement a singly linked list

public class LinkedList{


	Node head;


	static class Node{

		int data;
		Node next;

		//constructor

		Node(int d){
			data = d;
			next = null;
		}

	}

//Method to insert a new node


	public static LinkedList insert(LinkedList list, int data){

		//creeate a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		//if the linked list is empty,
		//then make the new node as head
		if(list.head == null){
			list.head = new_node;
		}else{
			//else traverse till the last node and insert the new_node there
			Node last = list.head;
			while (last.next != null){
				last = last.next;
			}
			//insert the new_node at last node
			last.mext = new_node;
		}

		//return the list by head

		return list;
	}
}


public static void printList(linkedList list){
	Node currNode = list.head;


	System.out.print("LinkedList: ");

	while (currNode != null){
		System.out.print(currNode.data + " ");
		//go to next node

		currNode = currNode.next;
	}
}


public static void main(String[] args){

	LinkedList list = new LinkedList();

// Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 

	




}
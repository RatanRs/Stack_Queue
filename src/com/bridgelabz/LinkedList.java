package com.bridgelabz;

public class LinkedList {
	Node head;
	
	class Node {
		Object data;
		Node ref;

		Node(Object data) {
			this.data = data;
		}
	}
	

	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null)
			head = newNode;
		else if (head.ref == null)
			head.ref = newNode;
		else {
			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}
	public void deleteFirst()
	{
		head = head.ref;
	}
	/*
	 *Method for displaying the added elements
	 */
	public void print() {
		if (head==null) {
			System.out.println("List is empty");
		}
			
			Node temp=head;
			while(temp != null) {
				if(temp.ref != null)
					System.out.print(temp.data+"=>");
				else
					System.out.println(temp.data);
			   temp =temp.ref;
		}
	}
}


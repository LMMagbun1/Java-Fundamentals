package com.kintegration.walmart.algorithms;

public class MyLinkedList {
	
	private Node head;
	private Node tail;
	
	static class Node {
		int nodeValue;
		Node next;
		
		Node(int value) {
			this.nodeValue = value;
		}
		
		public int getNodeValue() {
			return nodeValue;
		}

		public void setNodeValue(int nodeValue) {
			this.nodeValue = nodeValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	
	MyLinkedList() {		
	}
	
	
	public static MyLinkedList add(MyLinkedList ld, MyLinkedList.Node aNode) {

		if (ld.head == null) {
			ld.head = aNode;
		}
		else {
			Node last = ld.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next=ld.tail = aNode;
		}
		
 		return ld;
	}

		
	
	public static MyLinkedList merge(MyLinkedList ld1, MyLinkedList ld2) {
		if (ld1!=null && ld2==null) return ld1;
		if (ld1== null && ld2!=null) return ld2;
		if (ld1==null && ld2==null) {
			System.out.println("None of the linked has been created");
			return null;
		}
		
		ld1.tail.next = ld2.head;
		
		return ld1;
		
	}
	
	//blic static MyLinkedList sorList(MyLinkedList ld) {
		
	//}
	
	public static void main(String[] args) {
		
		MyLinkedList ld1 = new  MyLinkedList();
		ld1 = MyLinkedList.add(ld1, new Node(73));
		ld1 = MyLinkedList.add(ld1, new Node(3));
		ld1= MyLinkedList.add(ld1, new Node(13));
		
		MyLinkedList ld2 = new  MyLinkedList();
		ld2 = MyLinkedList.add(ld2, new Node(83));
		ld2 = MyLinkedList.add(ld2, new Node(31));
		ld2 = MyLinkedList.add(ld2, new Node(23));
		ld2 = MyLinkedList.add(ld2, new Node(51));
		ld2 = MyLinkedList.add(ld2, new Node(41));
		ld2 = MyLinkedList.add(ld2, new Node(61));
		
		MyLinkedList ld3 = merge(ld1, ld2);
		
		
		printList(bubleSort(ld3));
	}
	
	public static void printList(MyLinkedList ld) {
		if (ld!=null) {
			Node current = ld.head;
			while (current != null ) {
				System.out.println(current.nodeValue);
				current = current.next;
			}
		}
	}
	
	public static MyLinkedList bubleSort(MyLinkedList ld) {

		Node current = ld.head, index = null;

		int temp;

		if (current == null) {
			return ld;
		} else {
			while (current != null) {
				// Node index will point to node next to current
				index = current.next;

				while (index != null) {
					// If current node's data is greater than index's node data,
					// swap the data between them 
					if (current.nodeValue > index.nodeValue) {
						temp = current.nodeValue;
						current.nodeValue = index.nodeValue;
						index.nodeValue = temp;
					}
					index = index.next;
				}
				current = current.next;
			}

			return ld;
		}
	}

}

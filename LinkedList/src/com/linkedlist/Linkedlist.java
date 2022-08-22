package com.linkedlist;

import java.util.Arrays;

public class Linkedlist {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
		
	}
	private Node head;
	private Node tail;
	private int size =0;
	public void addFirst(int data) {
		size++;
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public void addLast(int data) {
		size++;
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		
	}
	public void removeFirst() {
		size--;
		if(head == null || head.next == null) {
			head = tail = null;
			return;	
		}
		Node temp = head.next;
		head.next = null;
		head = temp;
	}
	public void removeLast() {
		size--;
		if(head == null || head.next == null) {
			head = tail = null;
			return;
		}
		Node privous = getPrivous(tail);
		privous.next = null;
		tail = privous;
	}
	public Node getPrivous(Node node) {
		Node temp = head ;
		while (temp != null) {
			if(temp.next == node) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	public int indexOf(int data) {
		Node temp = head;
		int index = 0;
		while (temp != null) {
			if(temp.data == data) {
				return index;
			}
			index++;
			temp = temp.next;
		}
		return -1;
	}
	public boolean contain(int data) {
		Node temp = head;
		while (temp != null) {
			if(temp.data == data) {
				return true;
			}
			temp =temp.next;
		}
		return false;
	}
	public void reverse() {
		Node privous = head;
		Node current = head.next;
		while (current != null) {
			Node next = current.next;
			current .next = privous;
			privous = current;
			current = next;
		}
		head.next = null;
		tail = head;
		head =  privous;
	}
	public void toArray() {
		int[] arr = new int[size];
		int index = 0;
		Node temp = head;
		while (temp != null) {
			arr[index] = temp.data;
			index++;
			temp = temp.next;
		}
		System.out.println(Arrays.toString(arr));
	}
	public int getKthNode(int k) {
		Node a  = head;
		Node b = head;
		for (int i = 1; i < k; i++) {
			b = b.next;
		}
		while (b != tail) {
			a = a.next;
			b = b.next;
		}
		return a.data;
	}
	public int size() {
		return size;
	}
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ->");
			temp = temp.next;
		}
		System.out.println("null");
	}
}

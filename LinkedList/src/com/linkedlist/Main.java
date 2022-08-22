package com.linkedlist;

public class Main {
public static void main(String[] args) {
	Linkedlist list = new Linkedlist();
	//list.print();
	list.addFirst(50);
	list.addFirst(40);
	list.addFirst(30);
	list.print();
	list.addLast(60);
	list.addLast(70);
	list.print();
	list.removeFirst();
	list.print();
	list.removeLast();
	list.print();
	list.addFirst(30);
	list.addLast(70);
	list.print();
	System.out.println(list.size());
	System.out.println(list.indexOf(70));
	System.out.println(list.contain(80));
	list.toArray();
	System.out.println(list.getKthNode(2));
	//list.reverse();
	list.print();
	//list.addFirst(80);
	list.addLast(20);
	list.print();
}
}

package com.linklist.practise;

import java.util.LinkedList;

public class LinkedListExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		LinkedList<Book> b = new LinkedList<Book>();
		b.add(b1);
		b.add(b2);
		b.add(b3);

		for (Book ba : b) {
			System.out.println(ba.id + " " + ba.name + " " + ba.author + " " + ba.publisher + " " + ba.quntity);
		}

	}
}
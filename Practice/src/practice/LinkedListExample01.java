package practice;

class Node {
	int data;
	Node next;

}

class LinkedList extends Node {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {

			head = node;

		} else {

			Node n = head;

			while (n.next != null) {

				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;

		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null; // to clean the memory
		}
	}

	public void show() {

		Node node = head;

		while (node.next != null) {

			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}

public class LinkedListExample01 {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insert(67);
		list.insert(87);
		list.insert(45);
		list.insertAtStart(78);
		list.insertAt(0, 46);

		list.deleteAt(3);

		list.show();
	}
}

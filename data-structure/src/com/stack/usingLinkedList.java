package com.stack;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class usingLinkedList {
	private Node top;
	private int size;

	public usingLinkedList() {
		top = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void push(int item) {
		Node newNode = new Node(item);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		int poppedItem = top.data;
		top = top.next;
		size--;
		return poppedItem;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.data;
	}

	public static void main(String[] args) {
		usingLinkedList stack = new usingLinkedList();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element: " + stack.peek());
		System.out.println("Stack size: " + stack.size());

		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());

		System.out.println("Stack size after pops: " + stack.size());

	}

}

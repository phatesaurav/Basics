package com.stack;

import java.util.Arrays;

public class usingArray {
	private int size;
	private int[] stack;
	private int top;

	public usingArray(int size) {
		super();
		this.size = size;
		this.stack = new int[size];
		this.top = -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int element) throws Exception {
		if (!isFull()) {
			top++;
			stack[top] = element;
		} else {
			throw new Exception("Overflow");
		}
	}

	public void pop() throws Exception {
		if (!isEmpty()) {
			stack[top] = 0;
			top--;
		} else {
			throw new Exception("Underflow");
		}
	}

	public static void main(String[] args) throws Exception {
		usingArray refVar = new usingArray(5);
		refVar.push(1);
		refVar.push(2);
		refVar.push(3);
		refVar.push(4);
		refVar.push(5);
		System.out.println(refVar.toString());
		refVar.pop();
		System.out.println(refVar.toString());
		refVar.pop();
		System.out.println(refVar.toString());
	}

	@Override
	public String toString() {
		return "usingArray [stack=" + Arrays.toString(stack) + "]";
	}

}

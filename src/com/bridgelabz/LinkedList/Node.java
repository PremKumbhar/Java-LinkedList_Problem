package com.bridgelabz.LinkedList;

public class Node<T>{
	private T data;
	Integer s;
	
	private Node<T> next;
	
	public Node() {
		
	}
	public void compare() {
		
	}
	public Node(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
		
}

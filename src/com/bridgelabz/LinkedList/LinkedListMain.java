package com.bridgelabz.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.show();
        
        LinkedList<Integer> list2 = new LinkedList();
        list2.append(56);
        list2.append(30);
        list2.append(70);
        list2.show();
        
        LinkedList<Integer> list3 = new LinkedList();
        list3.push(70);
        list3.push(30);
        list3.push(56);
        list3.popFirst();
        list3.show();
        
        LinkedList<Integer> list4 = new LinkedList();
        list4.push(70);
        list4.push(30);
        list4.push(56);
        list4.popLast();
        list4.show();
        
        LinkedList<Integer> list5 = new LinkedList();
        list5.push(70);
        list5.push(30);
        list5.push(56);
       // list5.search(30);
        if (list5.search(30) == null)
            System.out.println("Element Not Found!");
        else
            System.out.println("Element Found");


       // list5.show();
	}

}

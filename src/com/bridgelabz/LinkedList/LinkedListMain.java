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
        
        LinkedList<Integer> list7 = new LinkedList();
        list7.append(56);
        list7.append(70);
        list7.searchAndInsert(56, 30);
        list7.show();
        
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
      
        if (list5.search(30) == null)
            System.out.println("Element Not Found!");
        else
            System.out.println("Element Found");
        
        LinkedList<Integer> list6 = new LinkedList();
        list6.push(70);
        list6.push(30);
        list6.push(56);
        boolean success = list6.searchAndInsert(30, 40);
        if (success)
            System.out.println("Searched And Inserted Element!");
        else
            System.out.println("Unsuccessfull!!");
        list6.show();
        
        LinkedList<Integer> list8 = new LinkedList();
        list8.push(70);
        list8.push(40);
        list8.push(30);
        list8.push(56);
        System.out.println("Display LinkedList of element");
        list8.show();
        System.out.println("LinkedList after delete the element");
        list8.popSearchNode(40);
        list8.show();
	}

}

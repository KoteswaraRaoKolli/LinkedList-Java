package com.umairsaeed.ds;

import com.umairsaeed.ds.LinkedList;

public class LinkedListTester {
	public static void main(String [] args){
		LinkedListTester.test1();
		LinkedListTester.test2();
		LinkedListTester.test3();
		LinkedListTester.test4();
		LinkedListTester.test5();
		LinkedListTester.test6();
	}
	
	public static void test1(){
		System.out.println("******");
		System.out.println("General LinkedList tests");
		LinkedList list = new LinkedList();
		System.out.println(list.toString());
		
		list.addToHead(new IntegerNode(4));
		list.addToHead(new IntegerNode(7));
		list.addToHead(new IntegerNode(3));
		list.addToHead(new IntegerNode(5));
		list.addToHead(new IntegerNode(9));
		
		System.out.println(list.toString());
		
		// Remove from head
		list.removeNode(new IntegerNode(9));
		System.out.println(list.toString());
		list.addToHead(new IntegerNode(9));
		
		// Remove from tail
		list.removeNode(new IntegerNode(4));
		System.out.println(list.toString());
		list.addToTail(new IntegerNode(4));

		// Remove from middle
		list.removeNode(new IntegerNode(3));
		System.out.println(list.toString());	
	}
	
	public static void test2(){
		System.out.println("******");
		System.out.println("Remove all duplicates, in place");

		LinkedList list = new LinkedList();	
		list.addToHead(new IntegerNode(4));		
		list.addToHead(new IntegerNode(9));
		list.addToHead(new IntegerNode(7));
		list.addToHead(new IntegerNode(4));
		list.addToHead(new IntegerNode(4));
		list.addToHead(new IntegerNode(3));
		list.addToHead(new IntegerNode(2));
		list.addToHead(new IntegerNode(2));
		list.addToHead(new IntegerNode(3));		
		list.addToHead(new IntegerNode(4));
		list.addToHead(new IntegerNode(2));
		System.out.println(list.toString());
		
		// Remove from head
		LinkedListUtils.removeDuplicatesInPlace(list);
		System.out.println(list.toString());
	}
	
	public static void test3(){
		System.out.println("******");
		System.out.println("Remove all duplicates, via hash map");

		LinkedList list = new LinkedList();	
		list.addToHead(new IntegerNode(4));		
		list.addToHead(new IntegerNode(9));
		list.addToHead(new IntegerNode(7));
		list.addToHead(new IntegerNode(4));
		list.addToHead(new IntegerNode(4));
		list.addToHead(new IntegerNode(3));
		list.addToHead(new IntegerNode(2));
		list.addToHead(new IntegerNode(2));
		list.addToHead(new IntegerNode(3));		
		list.addToHead(new IntegerNode(4));
		list.addToHead(new IntegerNode(2));
		System.out.println(list.toString());
		
		// Remove from head
		LinkedListUtils.removeDuplicates(list);
		System.out.println(list.toString());
	}	
	
	public static void test4(){
		System.out.println("******");
		System.out.println("Delete a middle node, when only the node is provided");

		LinkedList list = new LinkedList();	
		IntegerNode n1 = new IntegerNode(1);
		IntegerNode n2 = new IntegerNode(2);
		IntegerNode n3 = new IntegerNode(3);
		IntegerNode n4 = new IntegerNode(4);
		IntegerNode n5 = new IntegerNode(5);
		IntegerNode n6 = new IntegerNode(6);
		IntegerNode n7 = new IntegerNode(7);
		IntegerNode n8 = new IntegerNode(8);
		IntegerNode n9 = new IntegerNode(9);
		
		list.addToTail(n1);
		list.addToTail(n2);
		list.addToTail(n3);
		list.addToTail(n4);
		list.addToTail(n5);
		list.addToTail(n6);
		list.addToTail(n7);
		list.addToTail(n8);
		list.addToTail(n9);
		
		System.out.println(list.toString());
		LinkedListUtils.deleteMiddleNode(n2);
		System.out.println(list.toString());		
	}	

	public static void test5(){
		System.out.println("******");
		System.out.println("Find Circular loop");

		LinkedList list = new LinkedList();	
		IntegerNode n1 = new IntegerNode(1);
		IntegerNode n2 = new IntegerNode(2);
		IntegerNode n3 = new IntegerNode(3);
		IntegerNode n4 = new IntegerNode(4);
		IntegerNode n5 = new IntegerNode(5);
		IntegerNode n6 = new IntegerNode(6);
		IntegerNode n7 = new IntegerNode(7);
		IntegerNode n8 = new IntegerNode(8);
		IntegerNode n9 = new IntegerNode(9);

		n1.setNext(n2);			
		n2.setNext(n3);	
		n3.setNext(n4);
		n4.setNext(n5);	
		n5.setNext(n6);	
		n6.setNext(n7);
		n7.setNext(n6);	
		n8.setNext(n9);

		list.addToTail(n1);
	
		System.out.println(LinkedListUtils.findLoopStart(list).toString());
	}
	
	public static void test6(){
		System.out.println("******");
		System.out.println("Add two linked lists");

		LinkedList list1 = new LinkedList();	
		list1.addToTail(new IntegerNode(3));
		list1.addToTail(new IntegerNode(1));
		list1.addToTail(new IntegerNode(9));
		list1.addToTail(new IntegerNode(7));
		System.out.println(list1.toString());
		
		LinkedList list2 = new LinkedList();
		list2.addToTail(new IntegerNode(5));
		list2.addToTail(new IntegerNode(9));
		list2.addToTail(new IntegerNode(2));
		System.out.println(list2.toString());
	
		System.out.println(LinkedListUtils.addLinkedLists(list1, list2).toString());
		System.out.println(LinkedListUtils.addLinkedLists(list2, list1).toString());
	}	
}


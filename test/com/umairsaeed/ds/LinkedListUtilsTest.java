package com.umairsaeed.ds;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListUtilsTest {
	LinkedList list;
	IntegerNode n1;
	IntegerNode n2;
	IntegerNode n3;
	IntegerNode n4;
	IntegerNode n5;
	

	@Before
	public void setUp() {
		list = new LinkedList();
		n1 = new IntegerNode(1);
		n2 = new IntegerNode(2);
		n3 = new IntegerNode(3);
		n4 = new IntegerNode(4);
		n5 = new IntegerNode(5);

		list.addToTail(n1);
		list.addToTail(n2);
		list.addToTail(n3);
		list.addToTail(n4);
		list.addToTail(n5);
	}

	
	@Test
	public void testRemoveDuplicates() {
		System.out.println("testRemoveDuplicates");
		
		list.addToTail(new IntegerNode(1));
		list.addToTail(new IntegerNode(1));
		list.addToTail(new IntegerNode(2));
		list.addToTail(new IntegerNode(4));
		list.addToTail(new IntegerNode(6));
		System.out.println("--- Original List \t: " + list.toString());
		LinkedListUtils.removeDuplicates(list);
		System.out.println("--- No Duplicates \t: " + list.toString());
	}

	@Test
	public void testRemoveDuplicatesInPlace() {
		System.out.println("testRemoveDuplicatesInPlace");
		
		list.addToTail(new IntegerNode(1));
		list.addToTail(new IntegerNode(1));
		list.addToTail(new IntegerNode(2));
		list.addToTail(new IntegerNode(4));
		list.addToTail(new IntegerNode(6));		
		System.out.println("--- Original List \t: " + list.toString());
		LinkedListUtils.removeDuplicatesInPlace(list);
		System.out.println("--- No Duplicates \t: " + list.toString());
	}

	@Test
	public void testNthToLast() {
		System.out.println("testNthToLast");
	}

	@Test
	public void testDeleteMiddleNode() {
		System.out.println("testDeleteMiddleNode");
		LinkedListUtils.deleteMiddleNode(n2);
		assertFalse(list.contains(new IntegerNode(2)));
	}

	@Test
	public void testAddLinkedLists() {
		System.out.println("testAddLinkedLists");
		LinkedList list1 = new LinkedList();	
		list1.addToTail(new IntegerNode(3));
		list1.addToTail(new IntegerNode(1));
		list1.addToTail(new IntegerNode(9));
		list1.addToTail(new IntegerNode(7));
		
		LinkedList list2 = new LinkedList();
		list2.addToTail(new IntegerNode(5));
		list2.addToTail(new IntegerNode(9));
		list2.addToTail(new IntegerNode(2));
		
		LinkedList result = new LinkedList();
		result.addToTail(new IntegerNode(8));
		result.addToTail(new IntegerNode(0));
		result.addToTail(new IntegerNode(2));
		result.addToTail(new IntegerNode(8));

		assertTrue(LinkedListUtils.compareLists(LinkedListUtils.addLinkedLists(list1, list2), result));
		assertTrue(LinkedListUtils.compareLists(LinkedListUtils.addLinkedLists(list2, list1), result));	
	}

	@Test
	public void testFindLoopStart() {
		System.out.println("testFindLoopStart");
		
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
		n7.setNext(n4);	
		n8.setNext(n9);

		list.addToTail(n1);

		assertTrue(LinkedListUtils.findLoopStart(list).equals(n4));
	}

}

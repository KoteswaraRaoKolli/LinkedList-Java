package com.umairsaeed.ds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	private LinkedList list;
	private IntegerNode node1;
	private IntegerNode node2;
	private IntegerNode node3;

	@Before
	public void setUp() {
		list = new LinkedList();
		node1 = new IntegerNode(4);
		node2 = new IntegerNode(7);
		node3 = new IntegerNode(5);

		list.addToHead(node1); // List is 4
		list.addToHead(node2); // List is 7->4
		list.addToHead(node3); // List is 5->7->4
	}

	@Test
	public void testContains() {
		System.out.println("testContains");

		assertTrue(list.contains(node1));
		assertTrue(list.contains(node2));
		assertTrue(list.contains(node3));
		assertFalse(list.contains(new IntegerNode(1)));
	}

	@Test
	public void testSize() {
		System.out.println("testSize");
		assertEquals(list.size(), 3);
	}

	@Test
	public void testRemoveNode() {
		System.out.println("testRemove");

		// Remove from head
		list.removeNode(node3); // List is 7->4
		assertTrue(list.getHead().equals(node2));
		assertTrue(list.getTail().equals(node1));
		list.addToHead(node3); // List is 5->7->4

		// Remove from tail
		list.removeNode(node1); // List is 5->7
		assertTrue(list.getHead().equals(node3));
		assertTrue(list.getTail().equals(node2));
		list.addToTail(node1); // List is 5->7->4

		// Remove from Middle
		list.removeNode(node2); // List is 5->4
		assertEquals(list.size(), 2);
		assertTrue(list.getHead().equals(node3));
		assertTrue(list.getTail().equals(node1));
	}	
	
	@Test
	public void testAddToHead() {
		System.out.println("testAddToHead");
		IntegerNode node = new IntegerNode(3);

		list.addToHead(node);
		assertTrue(node.equals(list.getHead()));
		System.out.println(list.toString());
	}

	@Test
	public void testAddToTail() {
		System.out.println("testAddToTail");

		IntegerNode node = new IntegerNode(3);
		list.addToTail(node);
		assertTrue(node.equals(list.getTail()));
		System.out.println(list.toString());
	}

}

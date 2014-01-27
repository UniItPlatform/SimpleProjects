package test;

import junit.framework.TestCase;
import lists.LinkedList;

import org.junit.Test;

public class LinkedListTest extends TestCase{
	
	LinkedList<Integer> test_list = new LinkedList<Integer>();
	
	private void setValues() throws Exception {
		test_list.clearList();
		test_list.insertElement(5, 1);
		test_list.insertElement(6, 2);
		test_list.insertElement(7, 3);
		test_list.insertElement(8, 2);
		test_list.insertElement(9, 4);
		//5 8 6 9 7
	}
	
	public LinkedListTest(String testName) {
		super(testName);
	}

	@Test
	public void testLinkedListT() throws Exception {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		assertTrue(list1.isEmpty());
		
		LinkedList<Integer> list2 = new LinkedList<Integer>(5);
		assertFalse(list2.isEmpty());
		assertTrue(list2.getElementData(1) == 5);
	}

	@Test
	public void testIsEmpty() throws Exception {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue(list.isEmpty());
		
		list.insertFront(1);
		assertFalse(list.isEmpty());
		
		list.clearList();
		assertTrue(list.isEmpty());
	}

	@Test
	public void testGetElementData() throws Exception {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insertFront(5);
		list.insertFront(6);
		list.insertFront(7);
		
		assertTrue(list.getElementData(1) == 7);
		assertTrue(list.getElementData(2) == 6);
		assertFalse(list.getElementData(3) == 7);
	}

	@Test
	public void testInsertFront() throws Exception {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.insertFront(5);
		assertTrue(list.getElementData(1) == 5);
		
		list.insertFront(6);
		assertTrue(list.getElementData(1) == 6);
		
		list.insertFront(7);
		assertFalse(list.getElementData(1) == 5);
	}

	@Test
	public void testInsertBack() throws Exception {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.insertBack(5);
		assertTrue(list.getElementData(1) == 5);
		
		list.insertBack(6);
		assertTrue(list.getElementData(1) == 5);
		
		list.insertBack(7);
		assertTrue(list.getElementData(3) == 7);
		
		list.insertBack(8);
		assertFalse(list.getElementData(4) == 7);
	}

	@Test
	public void testInsertElement() throws Exception {
		setValues();
		
		assertTrue(test_list.getElementData(1) == 5);
		assertTrue(test_list.getElementData(2) == 8);
		assertTrue(test_list.getElementData(3) == 6);
		assertFalse(test_list.getElementData(4) == 7);
		assertFalse(test_list.getElementData(5) == 9);
	}

	@Test
	public void testDeleteFront() throws Exception {
		setValues();
		//5 8 6 9 7
		
		test_list.deleteFront();
		test_list.deleteFront();
		
		assertTrue(test_list.getElementData(1) == 6);
		assertFalse(test_list.getElementData(2) == 7);
		assertFalse(test_list.getElementData(3) == 6);
	}

	@Test
	public void testDeleteBack() throws Exception {
		setValues();
		//5 8 6 9 7
		
		test_list.deleteBack();
		test_list.deleteBack();
		
		assertTrue(test_list.getElementData(1) == 5);
		assertTrue(test_list.getElementData(2) == 8);
		assertFalse(test_list.getElementData(3) == 5);
	}

	@Test
	public void testDeleteElement() throws Exception {
		setValues();
		//5 8 6 9 7
		
		test_list.deleteElement(1);
		test_list.deleteElement(3);
		
		assertTrue(test_list.getElementData(1) == 8);
		assertTrue(test_list.getElementData(2) == 6);
		assertFalse(test_list.getElementData(3) == 6);
	}

	@Test
	public void testClearList() throws Exception {
		setValues();
		//5 8 6 9 7
		
		test_list.clearList();
		
		assertTrue(test_list.isEmpty());
	}

	@Test
	public void testFindByValue() throws Exception {
		setValues();
		//5 8 6 9 7
		
		assertTrue(test_list.findByValue(9) == 4);
		assertTrue(test_list.findByValue(6) == 3);
		assertFalse(test_list.findByValue(7) == 1);
	}

	@Test
	public void testShow() throws Exception {
		setValues();
		//5 8 6 9 7
		
		assertTrue(test_list.show().equals("5 8 6 9 7 "));
	}

	@Test
	public void testShowReverse() throws Exception {
		setValues();
		//5 8 6 9 7
		
		assertTrue(test_list.showReverse().equals("7 9 6 8 5 "));
	}

	@Test
	public void testIterator() throws Exception {
		setValues();
		
		int i = 1;
		for (Integer integer : test_list) {
			assertTrue(integer == test_list.getElementData(i));
			i++;
		}
	}

}

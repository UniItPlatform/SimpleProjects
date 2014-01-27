package test;

import junit.framework.TestCase;
import lists.ArrayList;

import org.junit.Test;

public class ArrayListTest extends TestCase{

	ArrayList<Integer> test_arr = new ArrayList<Integer>();
	
	private void setValues() throws Exception {
		test_arr.clearList();
		test_arr.insertFront(6);
		test_arr.insertFront(7);
		test_arr.insertFront(8);
		test_arr.insertFront(9);
		//6 7 8 9
	}
	
	public ArrayListTest(String testName) {
		super(testName);
	}
	
	@Test
	public void testArrayList() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		assertTrue(arr.isEmpty());
	}

	@Test
	public void testIsFull() {
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		assertFalse(arr.isEmpty());
		arr.insertBack(6);
		arr.insertBack(7);
		arr.insertBack(8);
		arr.insertBack(9);
		assertTrue(arr.isEmpty());
	}

	@Test
	public void testIsEmpty() throws Exception {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		assertTrue(arr.isEmpty());
		arr.insertBack(6);
		arr.insertBack(7);
		arr.insertBack(8);
		arr.insertBack(9);
		arr.clearList();
		assertTrue(arr.isEmpty());
	}

	@Test
	public void testGetElementData() throws Exception {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.insertBack(6);
		arr.insertBack(7);
		arr.insertBack(8);
		arr.insertBack(9);
		
		assertTrue(arr.getElementData(0) == 6);
		assertTrue(arr.getElementData(1) == 7);
		assertTrue(arr.getElementData(2) == 8);
		assertFalse(arr.getElementData(3) == 8);
	}

	@Test
	public void testInsertFront() throws Exception {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.insertFront(6);
		arr.insertFront(7);
		arr.insertFront(8);
		arr.insertFront(9);
		
		assertTrue(arr.getElementData(0) == 9);
		assertTrue(arr.getElementData(1) == 8);
		assertTrue(arr.getElementData(2) == 7);
		assertFalse(arr.getElementData(3) == 8);
	}

	@Test
	public void testInsertBack() throws Exception {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.insertBack(6);
		arr.insertBack(7);
		arr.insertBack(8);
		arr.insertBack(9);
		
		assertTrue(arr.getElementData(0) == 6);
		assertTrue(arr.getElementData(1) == 7);
		assertTrue(arr.getElementData(2) == 8);
		assertFalse(arr.getElementData(3) == 8);
	}

	@Test
	public void testInsertElement() throws Exception {
		setValues();

		test_arr.insertElement(5, 3);
		test_arr.insertElement(4, 4);
		
		assertTrue(test_arr.getElementData(0) == 9);
		assertTrue(test_arr.getElementData(1) == 8);
		assertTrue(test_arr.getElementData(5) == 6);
		assertFalse(test_arr.getElementData(3) == 6);
	}

	@Test
	public void testDeleteFront() throws Exception {
		setValues();
		
		test_arr.deleteFront();
		test_arr.deleteFront();
		
		assertTrue(test_arr.getElementData(0) == 7);
		assertTrue(test_arr.getElementData(1) == 6);
	}

	@Test
	public void testDeleteBack() throws Exception {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.insertFront(6);
		arr.insertFront(7);
		arr.insertFront(8);
		arr.insertFront(9);
		
		arr.deleteBack();
		arr.deleteBack();
		
		assertTrue(arr.getElementData(0) == 9);
		assertTrue(arr.getElementData(1) == 8);
	}

	@Test
	public void testDeleteElement() throws Exception {
		setValues();
		
		test_arr.deleteElement(0);
		test_arr.deleteElement(2);
		
		assertTrue(test_arr.getElementData(0) == 8);
		assertTrue(test_arr.getElementData(1) == 7);
	}

	@Test
	public void testClearList() throws Exception {
		setValues();
		
		test_arr.clearList();
		
		assertTrue(test_arr.isEmpty());
	}

	@Test
	public void testFindByValue() throws Exception {
		setValues();
		
		assertTrue(test_arr.findByValue(6) == 3);
		assertTrue(test_arr.findByValue(8) == 1);
		assertFalse(test_arr.findByValue(7) == 0);
	}

	@Test
	public void testShow() throws Exception {
		setValues();
		
		assertTrue(test_arr.show().equals("9 8 7 6 "));
	}

	@Test
	public void testShowReverse() throws Exception {
		setValues();
		
		assertTrue(test_arr.showReverse().equals("6 7 8 9 "));
	}

	@Test
	public void testIterator() throws Exception {
		setValues();
		
		int i = 1;
		for (Integer integer : test_arr) {
			assertTrue(integer == test_arr.getElementData(i));
			i++;
		}
	}

}

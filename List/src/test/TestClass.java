package test;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestClass {

	public static void main(String[] args) throws Exception {
		//LinkedList test
		
		TestRunner runnerLinked = new TestRunner();
	    TestSuite suiteLinked = new TestSuite();
	    
	    suiteLinked.addTest(new LinkedListTest("testLinkedListT"));
	    suiteLinked.addTest(new LinkedListTest("testIsEmpty"));
	    suiteLinked.addTest(new LinkedListTest("testGetElementData"));
	    suiteLinked.addTest(new LinkedListTest("testInsertFront"));
	    suiteLinked.addTest(new LinkedListTest("testInsertBack"));
	    suiteLinked.addTest(new LinkedListTest("testInsertElement"));
	    suiteLinked.addTest(new LinkedListTest("testDeleteFront"));
	    suiteLinked.addTest(new LinkedListTest("testDeleteBack"));
	    suiteLinked.addTest(new LinkedListTest("testDeleteElement"));
	    suiteLinked.addTest(new LinkedListTest("testClearList"));
	    suiteLinked.addTest(new LinkedListTest("testFindByValue"));
	    suiteLinked.addTest(new LinkedListTest("testShow"));
	    suiteLinked.addTest(new LinkedListTest("testShowReverse"));
	    suiteLinked.addTest(new LinkedListTest("testIterator"));
	    
	    runnerLinked.doRun(suiteLinked);//*/ 
	    
		
		
	    //ArrayList test
	    TestRunner runnerArray = new TestRunner();
	    TestSuite suiteArray = new TestSuite();
	    
	    suiteArray.addTest(new ArrayListTest("testArrayList"));
	    suiteArray.addTest(new ArrayListTest("testIsEmpty"));
	    suiteArray.addTest(new ArrayListTest("testGetElementData"));
	    suiteArray.addTest(new ArrayListTest("testInsertFront"));
	    suiteArray.addTest(new ArrayListTest("testInsertBack"));
	    suiteArray.addTest(new ArrayListTest("testInsertElement"));
	    suiteArray.addTest(new ArrayListTest("testDeleteFront"));
	    suiteArray.addTest(new ArrayListTest("testDeleteBack"));
	    suiteArray.addTest(new ArrayListTest("testDeleteElement"));
	    suiteArray.addTest(new ArrayListTest("testClearList"));
	    suiteArray.addTest(new ArrayListTest("testFindByValue"));
	    suiteArray.addTest(new ArrayListTest("testShow"));
	    suiteArray.addTest(new ArrayListTest("testShowReverse"));
	    suiteArray.addTest(new ArrayListTest("testIterator"));
	    
	    runnerArray.doRun(suiteArray);//*/ 
		
	}

}

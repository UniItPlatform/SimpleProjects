package lists;

import java.util.Iterator;

public class LinkedList<T> implements List<T>, Iterable<T>{
    
	private static final String BAD_INDEX = "Index is bad!";
	private static final String EMPTY_LIST = "List is empty!";
	
	private static final int INDEX_NOT_FOUND = -1;
	
    private class Refer {
        //class of List node
        public T data;
        public Refer previous;
        public Refer next;
        
        /*
         * I don't write setters and getters, because this class is used only in the external class,
         * it makes code less readable, you can compare:
         * element1.next.previous = element2  --- element1.getNext().setPrevious(element2)
         * incapsulation isn't need here, I think
         */

        public Refer(T data)
        {
            this.data = data;
        }
    
    }
    
    private Refer first_element; 
    private Refer last_element;	
    private int count;			 //the first element has index 1!!!, it's important, for ex ArrayList starts by 0
    
    @Override
    public int getCount() {
    	//readonly property; user should be able to get the elements count
    	return count;
    }

    public LinkedList(T data) {
    	first_element = new Refer(data);
    	last_element = new Refer(data);
        count = 1;
    }
    public LinkedList() {
        count = 0;
    }
    
	@Override
	public boolean isEmpty() {
		return (count == 0);
	}
    
    private Refer getElement(int index) throws Exception {
    	if (0 >= index || index > count)  
            throw new Exception("index is bad");
    	
    	Refer current;
    	//that way is shorter, from the begining or from the end?
        if (index < count / 2) {
        	current = first_element;
	        for (int i = 2; i <= index; i++)
	        	current = current.next;
        }
        else {
        	current = last_element;
        	for (int i = count; i > index; i--)
        		current = current.previous;
        }
        return current;   
    }
    
    @Override
    public T getElementData(int index) throws Exception {
        return getElement(index).data;
    }
    
    @Override
    public void insertFront(T data) {
        Refer ins_refer = new Refer(data);
        if (isEmpty()) {
        	first_element = ins_refer;
            last_element = ins_refer;
        }
        else {
            ins_refer.next = first_element;
            first_element = ins_refer;
            ins_refer.next.previous = ins_refer;
        }
        count++;
    }      
    @Override
    public void insertBack(T data) {
    	Refer ins_refer = new Refer(data);
        if (isEmpty()) {
        	first_element = ins_refer;
            last_element = ins_refer;
        }      
        else {
        	ins_refer.previous = last_element;
        	last_element = ins_refer;
        	last_element.previous.next = ins_refer;
        }
        count++;
    }
    @Override
    public void insertElement(T data, int index) throws Exception {
    	if (0 >= index || index > count + 1)
    		throw new Exception(BAD_INDEX);
    	
    	if (isEmpty() || index == 1)
    		insertFront(data);
    	else if (index == count + 1)
    		insertBack(data);
    	
    	else {
        	Refer ins_refer = new Refer(data);
        	Refer current = getElement(index);
        	
        	current.previous.next = ins_refer;
        	ins_refer.previous = current.previous;
        	ins_refer.next = current;
        	current.previous = ins_refer;
        	
        	count++;
    	}
    }
   
    @Override
    public void deleteFront() throws Exception {
        if (isEmpty())
        	throw new Exception(EMPTY_LIST);      
        
        if (count == 1) {
        	first_element = null;
        	last_element = null;
        }
        else {
        	first_element.next.previous = null;
        	first_element = first_element.next;
        }
        count--;
    }
    @Override
    public void deleteBack() throws Exception {
    	if (isEmpty())
        	throw new Exception(EMPTY_LIST);  
    	
    	if (count == 1)
    		deleteFront();
    	else {
    		last_element = last_element.previous;
    		last_element.next = null;
    		count--;
    	}
    }
    @Override
    public void deleteElement(int index) throws Exception {
    	if (0 >= index || index > count)
    		throw new Exception(BAD_INDEX);
    	if (count == 1 || index == count)
    		deleteBack();
    	else if (index == 1) 
    		deleteFront();
    	
    	else {
        	Refer del_refer = getElement(index);
        	del_refer.previous.next = del_refer.next;
        	del_refer.next.previous = del_refer.previous;
        	count--;
    	}
    }
    @Override
    public void clearList() {
    	while (!isEmpty()) {
    		first_element = first_element.next;
    		count--;
    	}
    }
    
    @Override
    public int findByValue(T data) {   	
    	int index = 1;
    	Refer current = first_element;
    	while (index <= count) { 
    		if (current.data.equals(data))
    			return index;
    		current = current.next;
    		index++;
    	}
    	return INDEX_NOT_FOUND;
    }
    
    @Override
    public String show() {
    	String result ="";
    	Refer current = first_element;
    	while (current != null) {
    		result += current.data + " ";
    		current = current.next;
    	}
    	return result;	
    }
    @Override
    public String showReverse() {
    	String result = "";
    	Refer current = last_element;
    	while (current != null) {
    		result += current.data + " ";
    		current = current.previous;
    	}
    	return result;	
    }
    
	@Override
	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	//oh, it's so boring, lets realize the Iterator
	private class ListIterator implements Iterator<T> {
		
		private int i = 0;
		
		@Override
		public boolean hasNext() {
			return i < count;
		}

		@Override
		public T next() {
			i++;	
			try {
				return getElementData(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public void remove() {	}
		
	}

       
}

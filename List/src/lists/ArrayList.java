package lists;

import java.util.Iterator;

public class ArrayList<T> implements List<T>, Iterable<T>{

	private static final int START_SIZE = 5;
	
	private static final int INDEX_NOT_FOUND = -1;
	private static final String BAD_INDEX = "Index is bad!";
	private static final String EMPTY_LIST = "List is empty!";
	
	private int size = START_SIZE; //текущий размер массива
	private int count = 0; 		   //количество не null элементов		
	
	private Object[] datas;		   //массив элементов, нумерация элементов в списке с 0!!
	
	@Override
    public int getCount() {
    	//свойство readonly, чтобы пользователь мог узнать кол-во элементов
    	return count;
    }
	
	public ArrayList() {
		createAndAssingByNull();
	}
	public ArrayList(int startCapacity) {
		size = startCapacity;
		createAndAssingByNull();
	}
	private void createAndAssingByNull() {
		datas = new Object[size];
		for (int i = 0; i < size; i++)
			datas[i] = null;
	}
	
	public boolean isFull() {
		return (count == size); 
	}
	@Override
	public boolean isEmpty() {
		return (count == 0);
	}
	private boolean isTrueIndex(int index) {
		return (0 >= index || index < count);
	}
	
	private void expandSize() {
		//увеличение размера массива вдвое 
		Object[] help_array = new Object[size];
		for (int i = 0; i < size; i++)
			help_array[i] = datas[i];
		int length = help_array.length;
		
		size *= 2;
		createAndAssingByNull();
		for (int i = 0; i < length; i++)
			datas[i] = help_array[i];		
	}
	private void shiftElementsRight(int start_index) {
		//сдвиг вправо для вставки элемента
		for (int i = count; i > start_index; i--) 
			datas[i] = datas[i - 1];			
	}
	private void shiftElementsLeft(int start_index) {
		//сдвиг влево для удаления элемента
		for (int i = start_index; i < count - 1; i++)
			datas[i] = datas[i + 1];
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T getElementData(int index) throws Exception {
		if (!isTrueIndex(index))
			throw new Exception(BAD_INDEX);
		
		return (T)datas[index];
	}

	@Override
	public void insertFront(T data) {
		if (isFull())
			expandSize();
		
		shiftElementsRight(0);
		datas[0] = data;
		count++;
	}
	@Override
	public void insertBack(T data) {
		if (isFull())
			expandSize();
		
		datas[count] = data;
		count++;
	}
	@Override
	public void insertElement(T data, int index) throws Exception {
		if (!isTrueIndex(index))
			throw new Exception(BAD_INDEX);
		if (isFull())
			expandSize();
		
		shiftElementsRight(index);
		datas[index] = data;
		count++;
	}

	@Override
	public void deleteFront() throws Exception {
		if (isEmpty()) 
			throw new Exception(EMPTY_LIST);
		
		shiftElementsLeft(0);
		datas[count] = null;
		count--;
	}
	@Override
	public void deleteBack() throws Exception {
		if (isEmpty()) 
			throw new Exception(EMPTY_LIST);
		
		datas[count] = null;
		count--;
	}
	@Override
	public void deleteElement(int index) throws Exception {
		if (!isTrueIndex(index))
			throw new Exception(BAD_INDEX);
		if (isEmpty()) 
			throw new Exception(EMPTY_LIST);
		
		shiftElementsLeft(index);
		datas[count] = null;
		count--;
	}
	@Override
	public void clearList() {
		for (int i = 0; i < size; i++)
			datas[i] = null;
		count = 0;
	}

	@Override
	public int findByValue(T data) {
		for (int i = 0; i < count; i++)
			if (datas[i].equals(data))
				return i;
		return INDEX_NOT_FOUND;
	}

	@Override
	public String show() {
		String result = "";
		for (int i = 0; i < count; i++)
			result += datas[i] + " ";
		return result;
	}

	@Override
	public String showReverse() {
		String result = "";
		for (int i = count - 1; i >= 0; i--)
			result += datas[i] + " ";
		return result;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator<T> {

		int i = 0;
		
		@Override
		public boolean hasNext() {
			return (i < count - 1);
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
		public void remove() { }
		
	}

}
package lists;

public interface List<T> {

	int getCount();
	
    T getElementData(int index) throws Exception;
    
    boolean isEmpty();

    void insertFront(T data);
    void insertBack(T data);
    void insertElement(T data, int index) throws Exception;

    void deleteFront() throws Exception;
    void deleteBack() throws Exception;
    void deleteElement(int index) throws Exception;
    void clearList();
    
    int findByValue(T data);

    String show();
    String showReverse();
}

package domino.edu.school;

public interface Array<T> {
	
	void add( T item);
	void clear();
	T getElement(int index);
	boolean isEmpty();
	int remove(T item);   //removes item from the array, and returns its former index
	T removeElement(int index);  //removes element identifed by index, and returns the removed value
	int size();
	
	
	
	
	
	
	
	
}

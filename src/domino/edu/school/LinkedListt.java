package domino.edu.school;



public class LinkedListt<T> implements Listt<T>   {
	
	public LinkedListt() {
		head=null;
	}

	@Override
	public void add( T item) {
		// TODO Auto-generated method stub
		head = new Node<T>(item, head);
	}

	@Override
	public void clear() {
		head = null;
	}

	@Override
	public T getElement(int index) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		while(current!=null && index>0) {
			current = current.next;
			--index;
		}
		return current!=null ? current.data : null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

	@Override
	
	
	public int size() {
		// TODO Auto-generated method stub
		Node<T> a = head;
		int i = 0;
		while(a!=null) {
			i++;
			a = a.next;
		}
		return i;
	}
	
	public T removeElement(int idx) {
		if (head==null)
			return null;
		
		if (idx == 0)
		{
			T res = head.data;
			head = head.next;
			return res;
		}
		else
		{
			Node<T> prev = head;
			while(prev!=null && idx>1)
			{
				prev = prev.next;
				idx--;
			}
			if (prev!=null && prev.next!=null)
			{
				T res = prev.next.data;
				prev.next = prev.next.next;
				return res;
			}
			else
				return null;
		}
	}
	
	public int remove(T item) {
		if (head==null || item==null)
			return -1;
		
		if (head.data == item)
		{
			head = head.next;
			return 0;
		}
		else
		{
			int pos = 1;
			Node<T> prev = head;
			while(prev.next!=null && prev.next.data!=item)
			{
				prev = prev.next;
				pos++;
			}
			if (prev.next!=null) {
				// => prev.next.data==item
				prev.next = prev.next.next;
				return pos;
			}
			else {
				return -1;
			}
		}
	}
	
	
	private static class Node<T> {
		 public Node<T> next;
		 public T data;
		 
		 public Node(T _data, Node<T> _next){
			 data = _data;
			 next = _next;
		 }
		 
		 public Node(T _data) {
			 data = _data;
		 }
	}

	private Node<T> head;

	

	
	

}

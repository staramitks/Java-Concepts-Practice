package home.amit.java.basic.collections;

import java.util.ArrayList;
import java.util.List;

public class MyList<E> extends ArrayList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4168656976239448163L;

	@Override
	public boolean add(E element)
	{
		super.add(element);
		boolean b=false;
		ensureCapacity(10);
		return b;
		
	}

	public static void main(String[] args) {
		List<Integer> mylist= new MyList<>();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(50);
		System.out.println(mylist);

	}
}

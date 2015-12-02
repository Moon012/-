package Study.Design_Pattern.Iterator_Pattern;

import java.util.ArrayList;

public class BookShelf2 implements Aggregate{

	
	private ArrayList<Book> arr;
	private int last = 0;
	
	public BookShelf2() {
		this.arr = new ArrayList<Book>();
	}
	
	public Book getBookAt(int index){
		
		return arr.get(index);
	}
	
	public void appendBook(Book book){
		this.arr.add(book);
	}
	
	public int getLength(){
		return arr.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator2(this);
	}
}

package Study.Design_Pattern.Iterator_Pattern;

public class BookShelfIterator2 implements Iterator {
	
	private BookShelf2 bookShelf2;
	private int index;
	
	public BookShelfIterator2(BookShelf2 bookShelf2) {
		this.bookShelf2 = bookShelf2;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		
		if(index < bookShelf2.getLength()){
			return true;
		}
		
		else {
			
			return false;
		}
	}

	@Override
	public Object next() {
		
		Book book = bookShelf2.getBookAt(index);
		index++;
		
		return book;
	}

}

package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : BookShelfIterator.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : BookShelfIterator는 Iterator를 구현한다. Iterator 인터페이스는 hasNext()와 next()
 * 				 두개의 추상메소드를 가진다. next() 추상메소드는 Object 타입이다. 타입변경을 하면 원하는
 * 				 객체의 타입을 반환할수 있다.
 */


public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		
		if(index < bookShelf.getLength()){
			return true;
		}
		
		else {
			
			return false;
		}
	}

	@Override
	public Object next() {
		
		Book book = bookShelf.getBookAt(index);
		index++;
		
		return book;
	}

}

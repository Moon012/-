package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : BookShelf.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Aggregate를 구현한 클래스 각 필요한 생성자와 메소드를 구현함 
 * 				  Aggregate의 iterator 추상메소드를 구현함 return (new) 객체생성을 하여 위임
 * 				 iterator 메소드의 this 객체는 BookShelf가 된다.
 */

public class BookShelf implements Aggregate {
	
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index){
		
		return books[index];
	}
	
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	
	public int getLength(){
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}

package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : Main.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Iterator패턴의 실행 메소드 BookShelf 클래스로 Iterator를 동작 시킬수 있다.
 * 				 Iterator는 BookShelfIterator에 실질적인 구현이 되어있다. 
 * 				 BookShelf의 iterator메소드에서 BookShelfIterator에 위임함.
 */

public class Main {
	
	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("해리포터"));
		bookShelf.appendBook(new Book("반지의제왕"));
		bookShelf.appendBook(new Book("무소유"));
		bookShelf.appendBook(new Book("E=mc^2"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}

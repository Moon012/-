package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : ArrayListMain.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : ArrayList로 구현한Iterator 패턴 테스트
 */

public class ArrayListMain {

	public static void main(String[] args) {
			
			BookShelf2 bookShelf = new BookShelf2();
			bookShelf.appendBook(new Book("해리포터"));
			bookShelf.appendBook(new Book("반지의제왕"));
			bookShelf.appendBook(new Book("무소유"));
			bookShelf.appendBook(new Book("E=mc^2"));
			bookShelf.appendBook(new Book("관계의힘"));
			bookShelf.appendBook(new Book("자바의정석"));
			bookShelf.appendBook(new Book("자료구조"));
			
			Iterator it = bookShelf.iterator();
			while(it.hasNext()){
				Book book = (Book) it.next();
				System.out.println(book.getName());
			}
		}

}

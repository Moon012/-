package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : BookShelf.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Aggregate�� ������ Ŭ���� �� �ʿ��� �����ڿ� �޼ҵ带 ������ 
 * 				  Aggregate�� iterator �߻�޼ҵ带 ������ return (new) ��ü������ �Ͽ� ����
 * 				 iterator �޼ҵ��� this ��ü�� BookShelf�� �ȴ�.
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

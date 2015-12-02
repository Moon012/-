package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : Main.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Iterator������ ���� �޼ҵ� BookShelf Ŭ������ Iterator�� ���� ��ų�� �ִ�.
 * 				 Iterator�� BookShelfIterator�� �������� ������ �Ǿ��ִ�. 
 * 				 BookShelf�� iterator�޼ҵ忡�� BookShelfIterator�� ������.
 */

public class Main {
	
	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("�ظ�����"));
		bookShelf.appendBook(new Book("����������"));
		bookShelf.appendBook(new Book("������"));
		bookShelf.appendBook(new Book("E=mc^2"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}

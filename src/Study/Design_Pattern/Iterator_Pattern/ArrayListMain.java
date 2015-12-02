package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : ArrayListMain.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ArrayList�� ������Iterator ���� �׽�Ʈ
 */

public class ArrayListMain {

	public static void main(String[] args) {
			
			BookShelf2 bookShelf = new BookShelf2();
			bookShelf.appendBook(new Book("�ظ�����"));
			bookShelf.appendBook(new Book("����������"));
			bookShelf.appendBook(new Book("������"));
			bookShelf.appendBook(new Book("E=mc^2"));
			bookShelf.appendBook(new Book("��������"));
			bookShelf.appendBook(new Book("�ڹ�������"));
			bookShelf.appendBook(new Book("�ڷᱸ��"));
			
			Iterator it = bookShelf.iterator();
			while(it.hasNext()){
				Book book = (Book) it.next();
				System.out.println(book.getName());
			}
		}

}

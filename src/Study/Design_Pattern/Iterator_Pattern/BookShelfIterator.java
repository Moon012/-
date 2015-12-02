package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : BookShelfIterator.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : BookShelfIterator�� Iterator�� �����Ѵ�. Iterator �������̽��� hasNext()�� next()
 * 				 �ΰ��� �߻�޼ҵ带 ������. next() �߻�޼ҵ�� Object Ÿ���̴�. Ÿ�Ժ����� �ϸ� ���ϴ�
 * 				 ��ü�� Ÿ���� ��ȯ�Ҽ� �ִ�.
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

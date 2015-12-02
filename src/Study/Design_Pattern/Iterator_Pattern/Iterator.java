package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : Iterator.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Iterator������ �ϱ� ���� Iterator�� �������̽��� ����
 * 				  hasNext() �޼ҵ�� next()�޼ҵ带 �߻�ȭ ��Ŵ
 */

public interface Iterator {
	
	public abstract boolean hasNext();
	public abstract Object next();
}

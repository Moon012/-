package Study.Design_Pattern.Template_Pattern;

/**
 * @FileName    : AbstractDisplay.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : AbstractDisplay �߻�޼ҵ�μ� �������� ������ ��ӹ��� Ŭ�������� ������ display �޼ҵ�� 
 * 				  �����Ѵ�. �� ���� Ŭ������ �־�� �Ѵ�.
 */

public abstract class AbstractDisplay {
	
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	public final void display(){
		open();
		for(int i = 0 ; i<5; i++){
			print();
		}
		close();
	}

}

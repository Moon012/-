package Study.Design_Pattern.Template_Pattern;

/**
 * @FileName    : Main.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : AbstractDisplayŬ���� Ÿ������ ��ӹ��� CharDisplay, StringDisplay ��ü�� ������Ŵ(������)
 * 				 ���� ����� ���� AbstractDisplay Ŭ������ display()�޼ҵ带 ���۽�Ű�� �� ���
 * 
 * -- Template Method ���� ���� : ���� Ŭ������ ���ø� �޼ҵ忡�� �˰����� ��� �Ǿ� �����Ƿ� ���� Ŭ������������ 
 * 								�˰����� ������ ����� �ʿ� ����.
 * 								Template Method ���� �ۼ��� ���α׷��� �˰����� ���� �߽߰�
 * 								 ���ø� �޼ҵ常 �����ϸ� ��.
 * 
 * -- Template Method Ŭ���� ���� : ���� Ŭ������ ���� Ŭ������ ����Ǿ��ִ�.
 * 								 ���� Ŭ�������� ����� �߻�޼ҵ带 ���� ���� Ŭ�������� �����Ҷ����� 
 * 								 �� �޼ҵ尡 ��� Ÿ�ֿ̹��� ȣ��Ǵ��� �����ؾ� �Ѵ�.
 * 								 ���� Ŭ������ �ҽ� ���α׷� ������ ���� Ŭ������ ������ ����� �� �ִ�.
 * 
 * -- LSP(The Liskov Substitution Principle) : ���� Ŭ������ ������ ���� Ŭ������ �ν��Ͻ��� �����ص� 
 * 											    ����� �۵��� �� �ֵ��� �Ѵ�.
 * 
 * 	(instanceof������ ���� Ŭ������ ������ Ư������ �ʾƵ� �۵��ϵ��� ����� ���� ����.)
 * 											
 */


public class Main {
	
	public static void main(String[] args){
		
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("�ȳ��ϼ���.");
		
		d1.display();
		d2.display();
		d3.display();
		
	}
	

}

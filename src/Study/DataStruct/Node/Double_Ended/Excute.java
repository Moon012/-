package Study.DataStruct.Node.Double_Ended;

/**
 * -- ���� �ܸ� ���� ����Ʈ
 * @FileName    : Excute.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ���� �ܸ� ���Ḯ��Ʈ �׽�Ʈ
 */

public class Excute {

	public static void main(String[] args) {
		
		Double_Ended de =  new Double_Ended();
		
		de.insertNode(4);
		de.insertNode(6);
		de.insertNode(2);
		de.insertNode(1);
		de.insertNode(7);
		
		de.display();
		
		System.out.println("");
		
		de.delete(4);
		de.delete(7); // ������ ��� ����
		de.display();
		System.out.println("������ ��� ���� �� ");
		System.out.println(de.headerNode.getLastNode().getData());
		
//		System.out.println("");
//		
//		de.find(7);
		
		
	}

}

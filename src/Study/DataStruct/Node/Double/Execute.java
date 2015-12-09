package Study.DataStruct.Node.Double;


/**
 * -- ���� ���� ����Ʈ
 * @FileName    : Excute.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ���� ���� ����Ʈ �׽�Ʈ
 */

public class Execute {

	public static void main(String[] args){
		
		Doubly_Linked_List dll = new Doubly_Linked_List();
		
		dll.insertNode(21);
		dll.insertNode(5);
		dll.insertNode(4);
		dll.insertNode(3);
		dll.insertNode(1);
		
		dll.display();
		
		System.out.println("");
		System.out.println("--------- ���� -----------");
		
		dll.delete(11);
		dll.delete(5);
		dll.delete(21); // ���⼭ ������ �����
		
		dll.display();
		System.out.println("����� ������� : " + dll.headerNode.getPrevious().getData());
		System.out.println("�߰� ����� ������� Ȯ��(���� 4�� ������� 3���) : " + dll.headerNode.getNextNode().getNextNode().getPrevious().getData());
		System.out.println("");
		
		dll.find(4);
	}
}

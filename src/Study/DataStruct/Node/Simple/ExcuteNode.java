package Study.DataStruct.Node.Simple;

public class ExcuteNode {

	public static void main(String[] args) {
		
		
		Singly_Linked_List sll = new Singly_Linked_List();
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(13);
		sll.addNode(14);
		

		sll.display();
		
		System.out.println("");
		System.out.println("�߰� ���");
		sll.insertNode(5);
		sll.display();
		
		System.out.println("");
		System.out.println("ã�� ���");
		
		LinkNode linkNode = sll.fideNode(13);
		
		if(linkNode == null){
			System.out.println("ã�� �� �����ϴ�.");
		}else {
			System.out.println(linkNode.getData());
		}
		
		System.out.println("");
		System.out.println("���� ���");
		
		sll.delete(5);
		sll.display();
		
		System.out.println("");
		System.out.println("ó�� ��� ����");
		
		sll.delete(1);
		sll.display();
		
	}

}

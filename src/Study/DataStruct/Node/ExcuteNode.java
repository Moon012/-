package Study.DataStruct.Node;

public class ExcuteNode {

	public static void main(String[] args) {
		
		
		Singly_linked_list sll = new Singly_linked_list();
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

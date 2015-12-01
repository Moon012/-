package Study.DataStruct.Node.Double;

public class Excute {

	public static void main(String[] args){
		
		Doubly_Linked_List dll = new Doubly_Linked_List();
		
		dll.insertNode(21);
		dll.insertNode(5);
		dll.insertNode(4);
		dll.insertNode(3);
		dll.insertNode(1);
		
		dll.display();
		
		System.out.println("");
		System.out.println("--------- 삭제 -----------");
		
		dll.delete(11);
		dll.delete(5);
		dll.delete(21); // 여기서 마지막 노드임
		
		dll.display();
		System.out.println("헤더의 이전노드 : " + dll.headerNode.getPrevious().getData());
		System.out.println("중간 노드의 이전노드 확인(예상 4의 이전노드 3출력) : " + dll.headerNode.getNextNode().getNextNode().getPrevious().getData());
		System.out.println("");
		
		dll.find(4);
	}
}

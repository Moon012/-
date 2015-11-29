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
		System.out.println("추가 노드");
		sll.insertNode(5);
		sll.display();
		
		System.out.println("");
		System.out.println("찾기 노드");
		
		LinkNode linkNode = sll.fideNode(13);
		
		if(linkNode == null){
			System.out.println("찾을 수 없습니다.");
		}else {
			System.out.println(linkNode.getData());
		}
		
		System.out.println("");
		System.out.println("삭제 노드");
		
		sll.delete(5);
		sll.display();
		
		System.out.println("");
		System.out.println("처음 노드 삭제");
		
		sll.delete(1);
		sll.display();
		
	}

}

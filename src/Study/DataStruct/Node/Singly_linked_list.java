package Study.DataStruct.Node;

public class Singly_linked_list {
	
	LinkNode HeaderNode;
	LinkNode nextNode;
	
	// 노드 추가(순차 삽입) - 중간 삽입은 따로 있음
	public void addNode(int key){
		
		if(HeaderNode == null)
		{
			HeaderNode = new LinkNode(key);
			nextNode = HeaderNode;
			HeaderNode.setLinkNode(nextNode);
			
		}
		else
		{
			nextNode = nextNode.getNodeNext();
			LinkNode linkNode = new LinkNode(key);
			nextNode.setLinkNode(linkNode);
		}
		
	}
	
	
	// 노드 찾기
	public LinkNode fideNode(int key){
		
		LinkNode current = HeaderNode;
		
		if(current == null){
			return null;
			
		}else{
			
			while(current.getData() != key){
				
				current = current.getNodeNext();
			}
			
			return current;
		}
	}
	
	
	//중간 삽입
	public void insertNode(int key){
		
		//키 값 생성
		LinkNode linkNode = new LinkNode(key);
		
		//삽입할 장소 찾기 위한 노드생성
		LinkNode current = HeaderNode.getNodeNext();
		LinkNode tempNode = null;
		
		while(current != null && key > current.getData()){
			tempNode = current;
			current = current.getNodeNext();
		}
		
		if(tempNode == null){
			HeaderNode = current;
		}else{
			tempNode.setLinkNode(linkNode);
			linkNode.setLinkNode(current);
		}
		
	}
	
	public LinkNode delete(int key){
		
		LinkNode current = HeaderNode;
		LinkNode tempNode = null;
		
		while(current != null && key != current.getData()){
			tempNode = current;
			current = current.getNodeNext();
			
		}
				
		if(tempNode != null && current != null){

			System.out.println("삭제 이전 노드 : " + tempNode.getData());
			
			tempNode.setLinkNode(current.getNodeNext());
			
		}else if(tempNode == null && current != null){//   첫노드가 삭제 될때 ? 과연
			
			HeaderNode = current.getNodeNext();
		}
		
		return current;
		
	}
	
	// 노드 보여주기
	public void display(){
		
		LinkNode current = HeaderNode;
		
		while(current != null){
			
			current.print();
			current = current.getNodeNext();
		}
	}
	
}

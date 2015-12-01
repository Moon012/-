package Study.DataStruct.Node.Double;

/**
 *  -- 이중 연결 리스트 
 * @FileName    : Doubly_Linked_List.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 :  insert(정렬된 삽입), delete, fide, display 메소드 구현
 */

public class Doubly_Linked_List {
	
	LinkNode headerNode;
	LinkNode nextNode;
	
	
	
	public void insertNode(int key){
		
		if(headerNode == null){
			
			headerNode = new LinkNode(key);
			
		}
		
		else{
			
			LinkNode current = headerNode;
			LinkNode previous = null;
			
			while(current != null && current.getData() < key){
				
				previous = current;
				current = current.getNextNode();
			}
			
			if(current == headerNode){
				
				headerNode = new LinkNode(key);
				headerNode.setNextNode(current);
				current.setPrevious(headerNode);
				
			}else{
				
				LinkNode linkNode = new LinkNode(key);
				previous.setNextNode(linkNode);
				linkNode.setPrevious(previous);
				linkNode.setNextNode(headerNode);
				headerNode.setPrevious(linkNode);
				
			}
		}
		
	}
	
	public void delete(int key){
		
		LinkNode current = headerNode;
		LinkNode previous = null;
		
		while(current != null && current.getData() < key){
			
			previous = current;
			current = current.getNextNode();
			
		}
		
		
		if(current.getNextNode() == null && current.getData() != key){
			
			System.out.println("삭제 할 값을 찾을 수 없습니다.");
			
		}
		
		else if(current.getNextNode() == null && current.getData() == key){

			previous.setNextNode(current.getNextNode());
			headerNode.setPrevious(previous);
		}
		
		else if(current == headerNode){
			
			headerNode.setNextNode(current.getNextNode());
			
		}
		
		else{
			previous.setNextNode(current.getNextNode());
			current.getNextNode().setPrevious(previous);
		}
		
	}
	
	
	public void find(int key){
		
		LinkNode current = headerNode;
		int count = 1;
		
		while(current != null && current.getData() != key){
			
			
			current = current.getNextNode();
			count ++;
		}
		
		System.out.println(count + "번째 값 : " + current.getData());
		
	}

	
	public void display(){
		
		LinkNode current = headerNode;
		
		while(current != null){
			current.print();
			current = current.getNextNode();
		}
		
	}
	
	
}

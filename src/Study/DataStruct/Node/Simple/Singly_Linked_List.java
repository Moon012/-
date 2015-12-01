package Study.DataStruct.Node.Simple;


/**
 * @FileName    : Singly_Linked_List.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     : 
 * @프로그램 설명 : 단순 연결 리스트 add(순차삽입 - 정렬 x), find, insert(중간삽입 - 값 비교 후 삽입),
 * 			  	  delete, display 메소드 구현
 */

public class Singly_Linked_List {
	
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
	
	public LinkNode findNode(int key){
		
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
			
		}else if(tempNode == null && current != null){
			
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

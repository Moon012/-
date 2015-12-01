package Study.DataStruct.Node.Double_Ended;

/**
 * -- 이중 단말 연결 리스트
 * @FileName    : Doubly_Linked_List.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 이중 단말 연결 리스트 headerNode 노드가 다음 노드와 마지막 노드의 주소 값을 가지고 있음
 * 				  insert(정렬된 삽입), delete, find, display 메소드 구현 
 */

import Study.DataStruct.Node.Simple.LinkNode;

public class Double_Ended {
	
	HeaderNode headerNode;
	
	
	public void insertNode(int key){
		
		//headerNode가 없을 경우 
		if(headerNode == null){
			
			LinkNode ln = new LinkNode(key);
			
			headerNode= new HeaderNode(ln);
			headerNode.setLastNode(ln);
		}
		
		//headerNode가 생성이 된경우
		else{
			
			LinkNode previous = null;
			LinkNode current = headerNode.getNextNode();
			
			//노드 값, 삽입을 위한 검색
			while (current != null && current.getData() < key){
				
				previous = current;
				current = current.getNodeNext();
				
			}
			
			// headerNode의 값이 입력값이 작을때 - 즉 입력 값이 headerNode가 되야 할때
			if(current == headerNode.getNextNode()){
				
				System.out.println("");
				
				LinkNode linkNode = headerNode.getNextNode();
				LinkNode ln = new LinkNode(key);  
				
				headerNode = new HeaderNode(ln);
				headerNode.getNextNode().setLinkNode(linkNode);
				
			}
			
			// headerNode보다 입력값이 클때 삽입
			else{
				
				LinkNode linkNode = new LinkNode(key);
				previous.setLinkNode(linkNode);
				linkNode.setLinkNode(current);
				
				//마지막 노드의 포인터 설정
				headerNode.setLastNode(linkNode);
				
			}
			
		}
		
	}
	
	public void delete(int key){
		
		LinkNode current = headerNode.getNextNode();
		LinkNode previous = null;
		
		while(current != null && key != current.getData()){
			previous = current;
			current = current.getNodeNext();
		}
		
		//while 문을 안들어갔기 때문에 current는 headerNode 이다.
		if(headerNode.getNextNode().getData() == key){
			headerNode.setNextNode(current.getNodeNext());
		}
		
		else if (headerNode.getLastNode().getData() == current.getData()){
			previous.setLinkNode(current.getNodeNext());
			headerNode.setLastNode(previous);
		}
		
		else{
			previous.setLinkNode(current.getNodeNext());
		}
		
	}
	
	
	public void find(int key){
		
		LinkNode current = headerNode.getNextNode();
		int count = 1;
		
		while(current != null && key != current.getData()){
			
			current = current.getNodeNext();
			count ++;
			
		}
		
		if(current == null){
			
			System.out.println("찾는 값이 없습니다.");
			
		}
		
		else{
			System.out.println(count + "번째 존재 : "+ current.getData());
		}
		
	}
	
	
	
	// 노드 보여주기
	public void display(){
		
		LinkNode current = headerNode.getNextNode();
		
		while(current != null){
			
			current.print();
			current = current.getNodeNext();
		}
	}
}
	


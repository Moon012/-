package Study.DataStruct.Node.Double;

/**
 *  -- ���� ���� ����Ʈ 
 * @FileName    : Doubly_Linked_List.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� :  insert(���ĵ� ����), delete, fide, display �޼ҵ� ����
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
			
			System.out.println("���� �� ���� ã�� �� �����ϴ�.");
			
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
		
		System.out.println(count + "��° �� : " + current.getData());
		
	}

	
	public void display(){
		
		LinkNode current = headerNode;
		
		while(current != null){
			current.print();
			current = current.getNextNode();
		}
		
	}
	
	
}

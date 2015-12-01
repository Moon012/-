package Study.DataStruct.Node.Simple;


/**
 * @FileName    : Singly_Linked_List.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @�ۼ���       : Moon
 * @�����̷�     : 
 * @���α׷� ���� : �ܼ� ���� ����Ʈ add(�������� - ���� x), find, insert(�߰����� - �� �� �� ����),
 * 			  	  delete, display �޼ҵ� ����
 */

public class Singly_Linked_List {
	
	LinkNode HeaderNode;
	LinkNode nextNode;
	
	
	// ��� �߰�(���� ����) - �߰� ������ ���� ����
	
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
	
	
	// ��� ã��
	
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
	
	
	//�߰� ����
	public void insertNode(int key){
		
		//Ű �� ����
		LinkNode linkNode = new LinkNode(key);
		
		//������ ��� ã�� ���� ������
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

			System.out.println("���� ���� ��� : " + tempNode.getData());
			
			tempNode.setLinkNode(current.getNodeNext());
			
		}else if(tempNode == null && current != null){
			
			HeaderNode = current.getNodeNext();
		}
		
		return current;
		
	}
	
	// ��� �����ֱ�
	public void display(){
		
		LinkNode current = HeaderNode;
		
		while(current != null){
			
			current.print();
			current = current.getNodeNext();
		}
	}
	
}

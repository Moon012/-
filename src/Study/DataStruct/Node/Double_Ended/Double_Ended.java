package Study.DataStruct.Node.Double_Ended;

import Study.DataStruct.Node.Simple.LinkNode;

public class Double_Ended {
	
	HeaderNode headerNode;
	
	
	public void insertNode(int key){
		
		//headerNode�� ���� ��� 
		if(headerNode == null){
			
			LinkNode ln = new LinkNode(key);
			
			headerNode= new HeaderNode(ln);
			headerNode.setLastNode(ln);
		}
		
		//headerNode�� ������ �Ȱ��
		else{
			
			LinkNode previous = null;
			LinkNode current = headerNode.getNextNode();
			
			//��� ��, ������ ���� �˻�
			while (current != null && current.getData() < key){
				
				previous = current;
				current = current.getNodeNext();
				
			}
			
			// headerNode�� ���� �Է°��� ������ - �� �Է� ���� headerNode�� �Ǿ� �Ҷ�
			if(current == headerNode.getNextNode()){
				
				System.out.println("");
				
				LinkNode linkNode = headerNode.getNextNode();
				LinkNode ln = new LinkNode(key);  
				
				headerNode = new HeaderNode(ln);
				headerNode.getNextNode().setLinkNode(linkNode);
				
			}
			
			// headerNode���� �Է°��� Ŭ�� ����
			else{
				
				LinkNode linkNode = new LinkNode(key);
				previous.setLinkNode(linkNode);
				linkNode.setLinkNode(current);
				
				//������ ����� ������ ����
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
		
		//while ���� �ȵ��� ������ current�� headerNode �̴�.
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
			
			System.out.println("ã�� ���� �����ϴ�.");
			
		}
		
		else{
			System.out.println(count + "��° ���� : "+ current.getData());
		}
		
	}
	
	
	
	// ��� �����ֱ�
	public void display(){
		
		LinkNode current = headerNode.getNextNode();
		
		while(current != null){
			
			current.print();
			current = current.getNodeNext();
		}
	}
}
	


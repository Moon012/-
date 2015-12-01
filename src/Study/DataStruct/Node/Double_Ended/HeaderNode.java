package Study.DataStruct.Node.Double_Ended;

import Study.DataStruct.Node.Simple.LinkNode;

/**
 * -- 이중 단말 연결 리스트
 * @FileName    : HeaderNode.java
 * @Project     : myStudy - 이중 단말 연결 리스트
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 단순 연결 리스트의 노드를 사용하였으며 HeaderNode는 마지막 노드와 연결이 되어있어야 함으로
 * 두개의 노드를 가지고 이중 단말 연결 리스트의  HeaderNode 구현
 * 
 */

public class HeaderNode {
	
	private LinkNode nextNode;
	private LinkNode lastNode;

	
	public HeaderNode(LinkNode linkNode){
		
		nextNode = linkNode;
	}
	
	
	public LinkNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkNode nextNode) {
		this.nextNode = nextNode;
	}

	public LinkNode getLastNode() {
		return lastNode;
	}

	public void setLastNode(LinkNode lastNode) {
		this.lastNode = lastNode;
	}


}

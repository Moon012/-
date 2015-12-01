package Study.DataStruct.Node.Double_Ended;

import Study.DataStruct.Node.Simple.LinkNode;

/**
 * -- ���� �ܸ� ���� ����Ʈ
 * @FileName    : HeaderNode.java
 * @Project     : myStudy - ���� �ܸ� ���� ����Ʈ
 * @Date        : 2015. 12. 1. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : �ܼ� ���� ����Ʈ�� ��带 ����Ͽ����� HeaderNode�� ������ ���� ������ �Ǿ��־�� ������
 * �ΰ��� ��带 ������ ���� �ܸ� ���� ����Ʈ��  HeaderNode ����
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
